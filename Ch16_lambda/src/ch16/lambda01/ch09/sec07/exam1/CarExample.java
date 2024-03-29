package ch16.lambda01.ch09.sec07.exam1;

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		Car car = new Car();
		
		// 익명 자식 객체가 대입된 필드 상요
		car.run1();
		
		// 익명 자식 객체가 대인된 로컬변수 사용
		car.run2();
		
		// 익명 자식 객체가 대입된 매개변수 
		// 즉석에서 Tire의 익명 자식 객체 생성
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다.");
			}
		});
	}
}
