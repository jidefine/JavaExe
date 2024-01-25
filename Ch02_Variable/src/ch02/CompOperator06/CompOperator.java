package ch02.CompOperator06;

import java.util.Scanner; // 빼먹지 말 것! 
// Scanner 작성 후 ctrl + Space 바

public class CompOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isLarge;
		int num0, num1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[대소 비교 연산]");
		System.out.println("1번째 숫자 입력");
		num0 = sc.nextInt();
		System.out.print("2번째 숫자 입력");
		num1 = sc.nextInt();
		
		isLarge = num0 > num1;
		System.out.println(num0 + "은 " + num1 + "보다 크다는 사실은 "+ isLarge + "입니다.");
		
		sc.close(); // 키보드와 연결을 닫음
	}

}
