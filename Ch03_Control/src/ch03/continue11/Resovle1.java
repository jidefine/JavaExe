package ch03.continue11;

import java.util.Scanner;

public class Resovle1 {
	public static void main(String[] args) {
//	for(int i=0;i<=5;i++)
//		System.out.println(i);
//	
		int sum = 0;

		for (int i = 1; i <= 100;) {
			if (i % 3 == 0)
				System.out.println(i);
			sum += i;
			i++; // 증감식(변화: 얼마만큼)
		}
		System.out.print("1~100까지의 정수 중에 3의 배수의 합은 " + sum);
	}
}
