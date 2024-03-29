package ch06.method01;

import java.util.Scanner;

// 메서드를 만들기 전 코드
public class MethodEx2 {
	// main 메서드 내의 계산하는 부분을 옮긴다.
	// calcArith의 지역변수 num0, num1, op -> 파라미터라고 하기도 함
	/* void : 비어있는 
	 * 		  / return 안하는 함수, 즉 실행만 하는 함수
	 */
	public static void calcArith(int num0, int num1, String op) {
		int result = 0; //결과값 저장 변수

		// 2) 계산을 하는 부분
		switch(op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0 / num1;
			break;
		case "%":
			result = num0 % num1;
			break;
		default:
			System.out.println("연산 불가능");
			break;
		}
		
		// 3) 결과값 출력하는 부분
		System.out.println("결과값은 "+result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1) 처리 전 입력받는 부분
		System.out.print("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.print("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("연산자 입력(+ - * / %) >> ");
		String op = sc.next();
		
		calcArith(num0, num1, op);
		
		sc.close();
	}

}
