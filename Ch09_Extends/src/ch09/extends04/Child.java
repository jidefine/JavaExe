package ch09.extends04;

public class Child extends Father {
	float day = 365 + 1.0f / 4; // float형으로 처리됨

	Child(){
		System.out.println("Child 생성자");
		//ExtendMain클래스에서 hild child = new Child();이러면 실행됨
	}
	
	Child(int score, long money, float day){
		super(score, money); //GrandFather 매개변수 생성자 호출
		this.day = day;
		System.out.println("Child 매개변수 생성자");
	}
	
	void play() {
		System.out.println("인생이 즐겁다^^");
	}
}
