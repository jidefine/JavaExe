package ch08.class07;

import java.util.Scanner;

/* 클래스는 영역이 확실하다(클래스의 캡슐화)
 * 클래스 = 멤버변수(피르) + 멤버함수(메서드)
 * 
 */
public class RestaurantMain {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
//		클래스도 자료형
//		우리가 직접 만든 사용자 정의 자료형
		
//		객체 = 클래스의 변수
//		클래스->Restaurant / 객체->rest / 클래스의 생성자형->Restaurant
//		클래스 객체 = new(힙에 할당) 클래스의 생성차형
		 
		//rest 안에는 참조변수 있음
 		Restaurant rest = new Restaurant(sc, "새마을 식당",
 								new String [] {"연탄불고기", "소금구이", "차돌박이"});
		rest.viewMenu();
		rest.selectFood();
		rest.delivertFood();
		
		Restaurant rest1 = new Restaurant(sc, "낙원타코",
								new String [] {"낙원파히타", "김치 브리또", "불고기퀘사디아"});
		rest1.viewMenu();
		rest1.selectFood();
		rest1.delivertFood();
		
		Restaurant rest2 = new Restaurant(sc, "소호정",
								new String [] {"안동국시", "국밥", "메밀묵"});
		rest2.viewMenu();
		rest2.selectFood();
		rest2.delivertFood();
	}

}
