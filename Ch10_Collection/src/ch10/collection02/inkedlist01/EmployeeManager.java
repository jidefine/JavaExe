package ch10.collection02.inkedlist01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
// [문제] 각 사원별로 정보보기 기능을 추가하세요

public class EmployeeManager {
	// 100명 사원이 최대
	private final int EMP_NUM = 100;
	//모든 타입의 객체를 저장하는 LinkedList(empList) 선언 
	LinkedList<Employee>empList = new LinkedList<Employee>();
	private int numOfEmp = 0;

	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기"); //추가
		System.out.println("5. 정규직 보기"); //추가
		System.out.println("6. 임시직 보기"); //추가
		System.out.println("7. 일용직 보기"); //추가
		System.out.println("8. 종료");      //변경 
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel; // 입력
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
		RegularEmployee emp = new RegularEmployee(empno, name, yearSalary, bonus);
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
		PartTimeEmployee emp = new PartTimeEmployee(empno, name, dailyPay, workDay);
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
		TempEmployee emp = new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}

	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;

		if (this.numOfEmp < EMP_NUM) {
			empList.add(emp);
			this.numOfEmp++;
			isSave = true;
		} else {
			isSave = false;
		}
		return isSave;
	}

	private void viewAllEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empList.get(i);
		}
//		empList.size();
//		Iterator<Employee> iterator = empList.iterator(); //Iterator 선언 
//		while(iterator.hasNext()){//다음값이 있는지 체크
//		    System.out.println(iterator.next()); //값 출력
//		}
	}

	private void viewRegEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empList.get(i);
			if(emp instanceof PartTimeEmployee)
				this.empList.get(i).showEmployeeInfo();
		}
//		Iterator<Employee> iterator = empList.iterator(); //Iterator 선언
//		while(iterator.hasNext()){//다음값이 있는지 체크
//			System.out.println(empList.contains(RegEmployee));
//		}
	}
	private void viewTempEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empList.get(i);
			if(emp instanceof TempEmployee)
				this.empList.get(i).showEmployeeInfo();
		}
	}
	private void viewPartTimeEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			Employee emp = this.empList.get(i);
			if(emp instanceof PartTimeEmployee)
				this.empList.get(i).showEmployeeInfo();
		}
	}
	
	
	public void run() {
		boolean isRun = true;
		while (isRun) {
			int selNum = viewMenu();
			Employee emp = null; // null은 객체가 없다는 뜻
			switch (selNum) {
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
			case EmpMenu.REG_INFO:
				viewRegEmployeeInfo();
				break;
			case EmpMenu.TEMP_INFO:
				viewTempEmployeeInfo();
				break;
			case EmpMenu.PART_INFO:
				viewPartTimeEmployeeInfo();
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
			if (emp != null) {
				boolean isSave = saveEmployee(emp);
				if (!isSave) { // !는 논리 부정 연산자
					System.out.println("더 이상 저장 공간 없음");
				}
			}
		}
		System.out.println("Exit..");
	}
}
