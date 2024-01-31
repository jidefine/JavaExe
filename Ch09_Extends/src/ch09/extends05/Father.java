package ch09.extends05;

public class Father extends GrandFather {
	private long money = 1000000000000000L;// L 붙이면 long타입 됨

	public Father() { // 기본적으로 default로 되어있음
		System.out.println("Father 생성자");
	}

	public Father(int score, long money) {
		super(score); // GrandFather 매개변수 생성자 호출
		this.money = money;
		System.out.println("Father 매개변수 생성자");
	}

	void wealth() {
		System.out.println("돈을 많이 벌었다");
	}
}
