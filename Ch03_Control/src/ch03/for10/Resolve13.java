package ch03.for10;

import java.util.Scanner;

public class Resolve13 {

	public static void main(String[] args) {
		
		int num;
		int result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 >> ");
		num = sc.nextInt();

		for(int i =1;i<= num;) { // ;을 통해서 한눈에 볼 수 있도록 사용
			result= i * 3; // 증가
			System.out.print(result + " "); // 실행
			i++;
		}
//		tutor 풀이 추가
//		for(int i=1;i<=num;i++)
//			System.out.println(3*i);
		sc.close();
	}

}
