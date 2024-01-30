package ch08.class01;

/* 클래스는 영역이 확실하다(클래스의 캡슐화)
 * 클래스 = 멤버변수(피르) + 멤버함수(메서드)
 * 
 */
public class RestanurantMain {

	public static void main(String[] args) {
//		클래스도 자료형
//		우리가 직접 만든 사용자 정의 자료형
		
//		객체 = 클래스의 변수
//		클래스->Restanurant / 객체->rest / 클래스의 생성자형->Restanurant
//		클래스 객체 = new(힙에 할당) 클래스의 생성차형
 		Restanurant rest = new Restanurant ();
		rest.viewMenu();
		rest.selectFood();
		rest.delivertFood();
		rest.keyboardEnd();
	}

}
