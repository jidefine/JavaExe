package ch05.array04;

import java.util.Scanner;

public class Resolve3 {
	public static void main(String[] args) {
		int i = 0;
		int[] arr = new int[7]; // 정석
		
		Scanner sc = new Scanner(System.in);
		
		for(int num = 0;num<7;num++) {
			System.out.print("학생 "+ num +" 학점 입력 >> ");
			arr[num] = sc.nextInt();
		}	
		
		int total = 0;
		for(i =0;i<arr.length;i++) {
			total += arr[i];
			
		}	
		double avg = (double)total/7;
		
		System.out.println("총점: " + total);
		System.out.printf("평균: ", avg);
		
		sc.close();
	}
}
