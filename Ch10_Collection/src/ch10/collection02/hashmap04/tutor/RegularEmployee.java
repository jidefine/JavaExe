package ch10.collection02.hashmap04.tutor;

public class RegularEmployee extends Employee {

	protected int yearSalary; // 연본
	protected int bonus;      // 보너스
	
	public RegularEmployee(String empno, String name,
			int yearSalary, int bonus) {
		super(empno, name); // Employee(empno, name) 호출
		this.yearSalary = yearSalary;
		this.bonus = bonus;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getMonthPay() {
		double mPay = (double)(yearSalary+bonus)/12;
		return mPay;
		
	}

	@Override
	public void showEmployeeInfo() { // 부모의 기능 + 추가 확장
		super.showEmployeeInfo(); // Employee의 showEmployeeInfo() 샐행
		System.out.println("bonus : " + bonus);
		System.out.printf("monthPay : %.2f \n", getMonthPay()); //.2f = 소수점둘째자리까지 출력
		
	}
	
}
