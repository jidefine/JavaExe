package ch05.array04;

import java.util.Scanner;

public class Resolve6 {
	public static void main(String[] args) {

		int i = 0;
		String[] names = new String[5]; // 학생 이름
		int[] score = new int[5]; //학생 성적
		
		Scanner sc = new Scanner(System.in);
		
		for(int num = 0;num<5;num++) {
			System.out.print("학생 "+ num +" 이름 입력 >> ");
			names [num] = sc.next(); // 문자열 입력
			System.out.print("학생 "+ num +" 성적 입력 >> ");
			score[num] = sc.nextInt();
		}
//		if(score[num]>=90)
//			System.out.print("A");
//
//		for(i=0;i<arr.length;i++)
//			System.out.println("arr["+i +"] : " + arr[i]);
//		System.out.println();
		
	}
}
