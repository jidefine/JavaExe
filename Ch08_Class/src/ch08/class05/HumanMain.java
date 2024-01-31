package ch08.class05;

public class HumanMain {
	
	public static void viewInfo(Human human){ // ~ Human human 파라미터 1개만 넣어도 간편하게 실행 가능
		System.out.println("이름 : "+human.name);
		System.out.println("나이 : "+human.age);
		System.out.println("학점 : "+human.score);
	}
	
	public static void main(String[] args) {
		Human human = new Human(); // 클래스를 만들고 값을 넣어줌으로써,~
		human.name = "홀길동";
		human.age = 24;
		human.score = 4.5;
		
		viewInfo(human);
		
		/* 중간에 많은 처리가 있었다.
		 * 그러나 age나 score값에 음수가 들어갔다.
		 */
		
		human.age = - 10;
		human.score = - 20.9;
		
		viewInfo(human);
	}
}
