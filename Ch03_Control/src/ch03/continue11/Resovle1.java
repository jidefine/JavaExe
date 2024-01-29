package ch03.continue11;

import java.util.Scanner;

public class Resovle1 {
	public static void main(String[] args) {

		int sum = 0; // stack에 들어감
					 // sum은 main 메서드의 지역변수

		for (int i = 1; i <= 100;) { // {}는 지역변수를 의미함
			if (i % 3 == 0)          // 해당 영역 {}을 벗어나면 지역변수는 stack에서 사라짐
				System.out.println(i);
			sum += i;
			i++; // 증감식(변화: 얼마만큼)
		}
		System.out.print("1~100까지의 정수 중에 3의 배수의 합은 " + sum);
	}
}
