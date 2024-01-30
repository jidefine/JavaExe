package ch05.array08;

import java.util.Arrays;

// 다시 풀어봐야 함
public class Resovle4 {

	public static void main(String[] args) {
		// 크기가 5인 정수 배열 numArr를 선언하고 초기값을 할당
		int[] numArr = { 10, 99, 2, 78, 32 };
		int i, j, k, temp;

		for (i = 0; i < numArr.length; i++) {
			// 변수 k는 현재 정렬되지 않은 부분 배열의 길이
			k = numArr.length - i;
			for (j = 1; j < k; j++) {
				if (numArr[j - 1] > numArr[j]) {
					// 임시 변수 temp를 사용하여 두 값을 교환하기 전에 이전 값을 저장
					temp = numArr[j - 1];
					numArr[j - 1] = numArr[j];
					// 이전 값을 저장한 임시 변수의 값을 할당하여 교환
					numArr[j] = temp;
				}
			}

		}
		
		// 정렬된 배열을 출력
		System.out.println(Arrays.toString(numArr));
	}
}
