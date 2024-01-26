package ch05.array03;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		
		/*
		 * 배열의 초기화
		 * 배열은 클래스이고 kor은 스택에 위치하여
		 * 참고값(해시코드)이 들어있고
		 * 실제 배열의 값은 힙 메모리에 위치한다
		 * 
		 * 정식 선언은 int[] kor = new inr[3]이지만
		 * 프로그래머의 편의를 위해 아래처럼 쵝화를 허용한다
		 * c언어때부터의 관습!
		 */
		int[] kor = {98, 99, 89};
		System.out.println("배열의 크기 " +  kor.length);
		
		int[] math = {100, 80, 78, 68, 90};
		System.out.println("배열의 크기 " +  math.length);

		int[] end = new int[] {100, 80, 78, 68}; // 할당하면서 동시에 초기화
		System.out.println("배열의 크기 " +  end.length);
		
		System.out.println();
		
		
		
	}

}
