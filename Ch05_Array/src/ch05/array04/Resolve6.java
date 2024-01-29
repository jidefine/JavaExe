package ch05.array04;

import java.util.Scanner;

// 

public class Resolve6 {
	public static void main(String[] args) {

		String[] names = new String[5]; // 학생 이름
		int[] score = new int[5]; //학생 성적
		
		Scanner sc = new Scanner(System.in);
		
		for(int num = 0;num<names.length;num++) {
			System.out.print("학생 "+ num +" 이름 입력 >> ");
			names[num] = sc.next(); // 문자열 입력
			System.out.println("학생 "+ num +" 성적 입력 >> ");
			score[num] = sc.nextInt();
		}
		
		for(int i =0;i<score.length;i++) {
			if(score[i]>=90)
				System.out.println(names[i] + " : A학점");
			else if(score[i]>=80)
				System.out.println(names[i] +" : B학점");
			else if(score[i]>=70)
				System.out.println(names[i] +" : C학점");
			else if(score[i]>=60)
				System.out.println(names[i] +" : D학점");
			else
				System.out.println(names[i] +" : F학점");
		}
			
		sc.close();

	}
}
