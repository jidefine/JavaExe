package ch09.abstract10;

import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100;// 100명 사원이 최대
	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	private int numOfEmp = 0; // 저장된 사원객체 수 = 다음 사원이 저장될 index
	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt(); // 번호를 입력받아서 정수형의 sel이라는 변수에 저장
		return sel; // 변수 sel을 리턴
	}

	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp =
				new RegularEmployee(empno, name, yearSalary, bonus);
		return emp;
	}

	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일급 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp =
				new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}

	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약 기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp =
				new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}

	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;
		
		if(this.numOfEmp < EMP_NUM) {
			this.empArr[this.numOfEmp] = emp;
			this.numOfEmp++;
			isSave = true;
		}else {
			isSave = false;
		}
		return isSave;
	}

	private void viewAllEmployeeInfo() {
		for(int i=0; i<this.numOfEmp; i++) {
			this.empArr[i].showEmployeeInfo();
		}
	}

	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null; // null은 객체가 없다는 뜻
			
			switch(selNum){
				case EmpMenu.REG_EMP:
					emp = createRegularEmployee();
					break;
				case EmpMenu.TEMP_EMP:
					emp = createPartTimeEmployee();
					break;
				case EmpMenu.PART_EMP:
					emp = createTempEmployee();
					break;
				case EmpMenu.ALL_EMP:
					emp = null; // null은 객체가 없다는 뜻
					viewAllEmployeeInfo();
					break;
				case EmpMenu.EXIT:
					emp = null;
					isRun = false;
					break;
				default:
					emp = null;
					System.out.println("해당 항목이 존재하지 않습니다.");
					break;
			}
			// emp객체가 존재한다면
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave) {
					System.out.println("더 이상 저장 공간 없음");
				}
			}
		}
		System.out.println("Exit..");
	}
}
