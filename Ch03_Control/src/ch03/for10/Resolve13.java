package ch03.for10;

import java.util.Scanner;

public class Resolve13 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 >> ");
		num = sc.nextInt();
		
		do {
				System.out.println("감사합니다");
				num--;
		}while(num>0);// 조건(언제까지)
			sc.close(); // 키보드와 연결을 닫음
	}

}
