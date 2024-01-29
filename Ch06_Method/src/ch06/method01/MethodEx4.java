package ch06.method01;

import java.util.Scanner;

// 메서드를 만들기 전 코드
public class MethodEx4 {
	// return하는 결과값의 자료형을 method 앞에 써 줌
	public static int calcArith(int num0, int num1, String op) {
		int result = 0; // 결과값 저장 변수

		// 2) 계산을 하는 부분
		switch (op) {
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
		
		// 이 함수(calcArith 함수)를 호출한 곳(main 함수)으로 이 값을 가지고 돌아가
		return result;
	}

	public static void viewResult(int result) {
		// 3) 결과값 출력하는 부분
		System.out.println("결과값은 " + result);
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

		// calcArith 함수에서 return 받은 값을 main함수의 지역변수인 result에 대입
		int result = calcArith(num0, num1, op);
		//main함수의 지역변수인 result을 받아서 viewResult 함수 실행
		viewResult(result); 


		sc.close();
	}

}
