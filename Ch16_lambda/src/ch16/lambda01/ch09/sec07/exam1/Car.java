package ch16.lambda01.ch09.sec07.exam1;

public class Car {
	// 필드에 기존 Tire 객체 대입
	private Tire tire1 = new Tire();
	
	// 필드에 익명 자식 객체 대힙
	// = Tire를 상속 받은 클래스 생성 + 클래스에서 자식 객체까지 생성
	//즉, 필드에서 Tire의 익명 자식 객체 생성
	private Tire tire2= new Tire() { 
		@Override
		public void roll() { // roll() 재정의
			System.out.println("익명 자식 Tire 객체 1이 굴러갑니다");
		}
	};
	
	// 메소드(필드 이용)
	public void run1() {
		tire1.roll(); // 원래 Tire 객체의 roll() 실행
		tire2.roll(); // Tire의 익명 자식 객체의 roll() 실행
	}
	
	// 메소드(로컬 변수 이용)
	// 로컬 변수에서 Tire의 익명 자식 객체 생성
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체 2이 굴러갑니다");
			}
		};
		tire.roll();
	}
	
	// 메소드(매개변수 이용)
	public void run3(Tire tire) {
		tire.roll();
	}
}

