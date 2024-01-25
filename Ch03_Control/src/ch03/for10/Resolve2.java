package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1~99까지의 정수 입력 >> ");
		int num = sc.nextInt();
		
		int num1 = num / 10;
		int num2 = num % 10;
		
		if(num1==3 | num1==6 | num1==9 ) {
			if(num2==3)
				System.out.println("박수짝짝");
			else if(num2==6)
				System.out.println("박수짝짝");
			else if(num2==9)
				System.out.println("박수짝짝");
			else
				System.out.println("박수짝");
		}

	}

}
