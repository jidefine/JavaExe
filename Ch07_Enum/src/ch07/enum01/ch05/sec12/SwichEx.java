package ch07.enum01.ch05.sec12;

import java.util.Scanner;

public class SwichEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. 짜장면");
		System.out.println("2. 짬뽕");
		System.out.println("3. 탕수육");
		System.out.println("4. 유산슬");
		System.out.println("5. 유린기");
		System.out.print("선택 >> ");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
//		sel의 값은 
		switch(sel){
		case Menu.ZZATANGMYUN: //리터럴 상수DLS 1을 ZZATANGMYUN로 변경
			System.out.println("짜장면이 나왔습니다");
			break;
		case Menu.ZZATPONG: //상수는 가급적 문자로 치환하는 것이 추후 수정시 편함
			System.out.println("짬뽕이 나왔습니다");
			break;
		case Menu.TANGSUYUK:
			System.out.println("탕수육이 나왔습니다");
			break;
		case Menu.YONGANSUL:
			System.out.println("유산슬이 나왔습니다");
			break;
		case Menu.YOULINGI:
			System.out.println("유린기가 나왔습니다");
			break;
		default: // else의 의미
			System.out.println("해당 메뉴 번호가 없습니다");
			break;
			
		}
		sc.close();
	}

}
