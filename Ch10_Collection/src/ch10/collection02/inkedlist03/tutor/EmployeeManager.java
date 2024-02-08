package ch10.collection02.inkedlist03.tutor;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {
	private List<Employee> empList = new LinkedList<>();
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 사번 검색");
		System.out.println("9. 사번 삭제");
		System.out.println("10. 사번 수정");
		System.out.println("11. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
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
	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = 
				new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}
	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = 
				new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}
	
	private boolean saveEmployee(Employee newEmp) {
		boolean isSave = false;
		for(int i=0;i<empList.size();i++) {
			Employee emp = empList.get(i);
			if(emp.empno.equals(newEmp.empno)) {
				System.out.println(emp.empno + " 사번을 갱신합니다.");
				empList.remove(i);
				empList.add(i, newEmp);
				isSave = true;
				break;
			}
		}
		
		if(!isSave) {
			System.out.println("새로운 사원을 추가합니다~");
			isSave = empList.add(newEmp);
		}
			
		return isSave;
	}
	private void viewAllEmployeeInfo() {
		for(int i=0;i<empList.size();i++) {
			System.out.println("****** " + (i+1) + " ******");
			Employee emp = empList.get(i);
			emp.showEmployeeInfo();
		}
		
	}
	private void viewRegEmployeeInfo() {
		for(int i=0;i<empList.size();i++) {
			Employee emp = empList.get(i);
			if(emp instanceof RegularEmployee) {
				System.out.println("****************");			
				emp.showEmployeeInfo();				
			}
		}
	}
	private void viewTempEmployeeInfo() {
		for(int i=0;i<empList.size();i++) {
			Employee emp = empList.get(i);
			if(emp instanceof TempEmployee) {
				System.out.println("****************");			
				emp.showEmployeeInfo();				
			}
		}
	}
	private void viewPartTimeEmployeeInfo() {
		for(int i=0;i<empList.size();i++) {
			Employee emp = empList.get(i);
			if(emp instanceof PartTimeEmployee) {
				System.out.println("****************");			
				emp.showEmployeeInfo();				
			}
		}
	}
	private String getEmpNo() {
		System.out.print("사번 입력 >> ");
		String empNo = sc.next();
		return empNo;
	}
	private void searchEmployee(String empno) {
		for(int i=0;i<empList.size();i++) {			
			Employee emp = empList.get(i);
			if(emp.empno.equals(empno)) {
				System.out.println("****** " + (i+1) + " ******");
				emp.showEmployeeInfo();
			}
		}
	}
	private void deleteEmployee(String empno) {
		for(int i=0;i<empList.size();i++) {
			Employee emp = empList.get(i);
			if(emp.empno.equals(empno)) {
				empList.remove(i);
				System.out.println("****** " + (i+1) + " ******");
				System.out.println("인덱스 " + i + "를 삭제했습니다.");
			}
		}
	}
	private void modifyEmployee() {
		System.out.println("Main Menu에서 사번과 정보를 입력하시면 새로 갱신됩니다~");
		sc.nextLine();
		sc.nextLine();
	}
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
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
			case EmpMenu.EMPNO_SEARCH:
				searchEmployee(getEmpNo());
				break;
			case EmpMenu.EMPNO_DELETE:
				deleteEmployee(getEmpNo());
				break;
			case EmpMenu.EMPNO_MODIFY:
				modifyEmployee();
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
				if(!isSave)
					System.out.println("오류가 발생했습니다.");
			}
		}
		System.out.println("Program Exit...");
	}
}
