package ch06.method01;

import java.util.Scanner;

/* 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
   작은 값을 반환하는 메서드를 작성하고 사용하세요.
*/
public class Resolve1 {
	public static int max(int num0, int num1) {
		int result = 0;
		if(num0 < num1)
			result = num1;
		else
			result = num0;
		return result;
		
//		1) 조건(삼항)연산자 사용
//		A ? B : C; 3개의 항목
//		항목의 조건 ? true면 실행 : false면 실행
//		return num0 < num1 ? num1 : num0;
	}
	
	public static int min(int num0, int num1) {
		int result = 0;
		if(num0 < num1)
			result = num0;
		else
			result = num1;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		
		int max = max(num0, num1);
		int min = min(num0, num1);
		
		System.out.println("큰 값 : " + max);
		System.out.println("작은 값 : " + min);
		
		sc.close();
	}

}
