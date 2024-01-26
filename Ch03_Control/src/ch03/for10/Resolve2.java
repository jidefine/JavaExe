package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~99까지의 정수 입력 >> ");
		int num = sc.nextInt();
		
		int num1 = num / 10;
		int num2 = num % 10;
		
//		풀이방법 1)
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
		else if(num1!=3 | num1!=6 | num1!=9) {
			if(num2==3 | num2==6 | num2==9)
				System.out.println("박수짝");
		}

//		풀이방법 2)
//		if(num1==3 | num1==6 | num1==9 ) {
//			if(num2==3 | num2==6 | num2==9)
//				System.out.println("박수짝짝");
//			else
//				System.out.println("박수짝");
//		}
//		else if(num1!=3 | num1!=6 | num1!=9) {
//			if(num2==3 | num2==6 | num2==9)
//				System.out.println("박수짝");
//		}
		
//		풀이방법 3)
//		while(true) {
//			
//			System.out.print("1~99까지의 정수 입력 >> ");
//			int num = sc.nextInt();
//			if(num < 0)
//				break;
//			
//			int num1 = num / 10;
//			int num2 = num % 10;
//			
//			int count = 0;
//			if(num1==3 | num1==6 | num1==9 )
//				count++;
//			if(num2==3 | num2==6 | num2==9)
//				count++;
//			if(count==1)
//				System.out.println("박수짝");
//			if(count==2)
//				System.out.println("박수짝짝");
//		}
//		System.out.println("End~");

	}

}
