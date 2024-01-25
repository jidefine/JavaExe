package ch03.control01;

import java.util.Scanner;

public class ifEX {

	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 사이의 점수 입력 >> ");
		score = sc.nextInt();
		
		//if문은 ()의 결과가 참일 때 소속 영역 실행
		if(score>= 90)
			System.out.println("A학점");
		
		sc.close(); // 키보드와 연결을 닫음

	}

}
