package ch10.collection02.hashmap02.tutor;
/*
 * 다형성
 * 1) 부모클래스에 자식 객체는 담을 수 있다
 * 2) 부모클래스 변수로 메서드를 호출하면 각 객체의 메서드가 호훌된다
 *    이때, 자식의 고유 개성은 발현된다
 */
public abstract class Employee {
protected String empno;
protected String name;

public Employee(String empno, String name) {
	this.empno = empno;
	this.name = name;
}
public void showEmployeeInfo() {
	System.out.println("----------------------");
	System.out.println("empno : " + empno);
	System.out.println("name : " + name);
	
}
public abstract double getMonthPay();	// 추상메서드
}
