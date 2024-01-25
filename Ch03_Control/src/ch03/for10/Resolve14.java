package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

	public static void main(String[] args) {
		
		int num;
		int result;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 中 몇 단? >> ");
		num = sc.nextInt();

		for(int i =1;i<= 9;) { // ;을 통해서 한눈에 볼 수 있도록 사용
			result= i * num; // 증가
			System.out.println(num + " * "+ i + " = " + result); // 실행
			i++;
		}
	}

}
