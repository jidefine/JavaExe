package ch03.control06;

import java.util.Scanner;

public class SwichEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 봄");
		System.out.println("2. 여름");
		System.out.println("3. 가을");
		System.out.println("4. 겨울");
		System.out.print("선택 >> ");
		
		Scanner sc = new Scanner(System.in);
		String sel = sc.nextLine();
		
//		문자로 변환
		switch(sel){
		case "봄":
			System.out.println("새싹이 자란다");
			break;
		case "여름":
			System.out.println("산과 바다로 가자");
			break;
		case "가을":
			System.out.println("책을 읽자");
			break;
		case "겨울":
			System.out.println("스키장에 간다");
			break;
			
		}
		sc.close();
	}

}
