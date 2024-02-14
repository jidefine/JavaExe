package ch16.lambda02.ch16.sec02.exam01;

public class Person {
	//Workable 인터페이스의 자식 객체를 얻을 수 있음
	public void action(Workable workable) {
		workable.work();
	}
}
