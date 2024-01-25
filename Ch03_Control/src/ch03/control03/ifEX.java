package ch03.control03;

import java.util.Scanner;

public class ifEX {

	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 사이의 점수 입력 >> ");
		score = sc.nextInt();
		
		//if문은 ()의 결과가 참일 때
		if(score>= 90)
			System.out.println("A학점");
		else if(score>= 80)
			System.out.println("B학점");
		else if(score>= 70)
			System.out.println("C학점");
		else if(score>= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");
		
		sc.close(); // 키보드와 연결을 닫음

	}

}
