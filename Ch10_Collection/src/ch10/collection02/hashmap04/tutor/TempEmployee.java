package ch10.collection02.hashmap04.tutor;

public class TempEmployee extends Employee {

	protected int yearSalary; // 연봉
	protected int hireYear;      // 계약기간
	
	public TempEmployee(String empno, String name,
			int yearSalary, int hireYear) {
		super(empno, name);
		this.yearSalary = yearSalary;
		this.hireYear = hireYear;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)yearSalary/12;
		return mPay;
	}

	@Override
	public void showEmployeeInfo() {
		// TODO Auto-generated method stub
		super.showEmployeeInfo();
		System.out.println("yearSalary : " + yearSalary);
		System.out.println("hireYear : " + hireYear);
		System.out.println("monthPay : " + getMonthPay());
	}
	
}
