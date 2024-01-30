package ch08.class01;

import java.util.Scanner;
/* 클래스는 영역이 확실하다(클래스의 캡슐화)
 * 클래스 = 멤버변수(필드) + 멤버함수(메서드)
 * 
 * 식당
 * 필드=변수=명사
 * 메서드=함수=동사
 * 
 * [클래스의 대상]
 * 큰 개념의 명사 / 유기적인 큰 개념
 * 동사들의 집합(Controller, Business Layer)
 * 필드들의 집합(Vo, Dto)
 */

// 식당 클래스 정의
public class Restanurant {
	//필드
	private String[] foods = { "냉면", "떡볶이", "쌀국수", // foods라는 이름을 가진 문자열 타입의 배열 선언
			                   "칼국수", "순대", "튀김", "라면" };
	private int selectNum; // selectNum이라는 이름을 가진 정수 타입을 선언
	private Scanner sc = new Scanner(System.in); // 사용자의 키보드 입력을 읽어오기 위한 Scanner 객체를
	                                             // private으로 선언하고 초기화
//	Scanner: 자바의 표준 입력을 받기 위한 클래스입니다.
//	System.in: 표준 입력 스트림을 나타내는 객체로, 사용자의 키보드 입력을 읽어오기 위해 사용됩니다.
//	new Scanner(System.in): Scanner 클래스의 생성자를 호출하여 새로운 Scanner 객체를 생성합니다. 이 객체는 키보드로부터 입력을 받을 수 있게 됩니다.
//	private Scanner sc: Scanner 객체를 나타내는 변수 sc를 private으로 선언합니다. 
	
	// 메서드
	public void viewMenu() { //void는 메서드가 어떤 값을 반환하지 않음
		for (int i = 0; i < foods.length; i++) {
			System.out.println(i + "." + foods[i]);
		}
	}

	public void selectFood() {
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt(); // 사용자로부터 입력받은 값을 selectNum이라는 변수에 제장
	}

	public void delivertFood() {
		String food = foods[selectNum]; 문자열 배열 foods 의 selectNum 번째 위치에 해당하는 수를 food라는 변수에 저장
		System.out.println(food + "이 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}

	public void keyboardEnd() {
		sc.close();
	}
}
