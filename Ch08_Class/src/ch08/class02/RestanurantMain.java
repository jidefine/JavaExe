package ch08.class02;

import java.util.Scanner;

/* 클래스는 자료형이므로
 * 여려 개의 변수 즉, 객체를 얼마든지 만들어낼 수 있다.
 * 그리고 각 객페는 독립된 공간을 가지므로
 * 내부의 값을 다르게 가질 수 있다.
 */
public class RestanurantMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		클래스도 자료형
//		우리가 직접 만든 사용자 정의 자료형
		
//		객체 = 클래스의 변수
//		클래스->Restanurant / 객체->rest / 클래스의 생성자형->Restanurant
//		클래스 객체 = new(힙에 할당) 클래스의 생성차형
 		Restanurant rest = new Restanurant ();
 		rest.sc = sc;
 		rest.name = "새마을식당";
		rest.viewMenu();
		rest.selectFood();
		rest.delivertFood();
		
		Restanurant rest1 = new Restanurant ();
		rest1.sc = sc;
 		rest1.name = "낙원타코";
		rest1.viewMenu();
		rest1.selectFood();
		rest1.delivertFood();
		
		Restanurant rest2 = new Restanurant ();
		rest2.sc = sc;
 		rest2.name = "소호정";
		rest2.viewMenu();
		rest2.selectFood();
		rest2.delivertFood();

		sc.close();
	}

}
