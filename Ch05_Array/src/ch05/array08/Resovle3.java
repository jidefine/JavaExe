package ch05.array08;

import java.util.Arrays;
// 3. 정수 배열 5개를 할당하고
//System.out.println(Arrays.toString(numArr));
//로 배열을 출력했을 때 거꾸로 출력되도록
//배열의 값을 거꾸로 저장하세요.
public class Resovle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		System.out.println(Arrays.toString(numArr));

	}

}
