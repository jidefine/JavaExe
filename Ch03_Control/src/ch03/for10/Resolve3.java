//3. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
//   삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)

package ch03.for10;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int c;
		String result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 >> ");
		a = sc.nextInt();
		System.out.print("정수 2 >> ");
		b = sc.nextInt();
		System.out.print("정수 3 >> ");
		c = sc.nextInt();
		
//		tutor 풀이
		boolean bTriangle = false;
		
//		if((num0+num1 > num2) && 
//		(num1+num2 > num0) &&
//		(num2+num0 > num1))
//		bTriangle = true;
		
		if((a+b) > c) {
			if((a+c) > b){
				if((b+c) > a)
					bTriangle = true;
			}
		}
		System.out.println("결과는 "+bTriangle);
		
//		tutor 풀이2(조건연산자 사용)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1번째 숫자 입력 >> ");
//		int num0 = sc.nextInt();
//		System.out.print("2번째 숫자 입력 >> ");
//		int num1 = sc.nextInt();
//		System.out.print("3번째 숫자 입력 >> ");
//		int num2 = sc.nextInt();
//		
//		boolean bTriangle = false;
//		
//		boolean cond0 = num0+num1 > num2;
//		boolean cond1 = num1+num2 > num0;
//		boolean cond2 = num2+num0 > num1;
//		
//		bTriangle = cond0 ? (cond1 ? (cond2 ? true : false) 
//				                   : false) 
//				          : false; 				
//		
//
//		System.out.println("삼각형의 조건이 " + bTriangle + "입니다");
//		
//		sc.close();		
		
//		내가 푼 풀이_조건(삼항)연산자 사용
//		A ? B : C; 3개의 항목
//		항목의 조건 ? true면 실행 : false면 실행
//		result = (b < (a + c)) ? "삼각형을 만들 수 있습니다.":"삼각형을 만들 수 없습니다.";
//		
//		System.out.println(result);
		sc.close();
	}

}
