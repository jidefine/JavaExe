package ch10.collection02.hashmap02.tutor;

public class PartTimeEmployee extends Employee {
	
	protected int dailyPay; // 일당
	protected int workDay; // 일한 일수
	
	public PartTimeEmployee(String empno, String name,
			int dailyPay, int workDay) {
		super(empno, name);
		this.dailyPay = dailyPay;
		this.workDay = workDay;
	}

	@Override
	public double getMonthPay() {
		double mPay = dailyPay*workDay;
		return mPay;
	}
	
	@Override
	public void showEmployeeInfo() { // 부모의 기능 + 추가 확장
		super.showEmployeeInfo(); // Employee의 showEmployeeInfo() 샐행
		System.out.println("dailyPay : " + dailyPay);
		System.out.println("workDay : " + workDay);
		System.out.println("monthPay : " + getMonthPay());
		
	}

}
