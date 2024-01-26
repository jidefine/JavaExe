package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

	public static void main(String[] args) {
		
		int sum = 0;
		
//      풀이방법 1)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		
		while(num != 0) {
			
			System.out.print("정수 입력 >> ");
			sum+=num; // 증가
			num = sc.nextInt();
		}
		System.out.print("합은 " + sum);
		
//		풀이방법 2)
//		int num;
//		do {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("정수 입력 >> ");
//			num = sc.nextInt();
//			sum+=num; // 증가
//		}while(num != 0);
//		System.out.print("합은 " + sum);
	}

}
