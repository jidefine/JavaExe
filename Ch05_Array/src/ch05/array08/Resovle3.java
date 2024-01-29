package ch05.array08;

import java.util.Arrays;
// 문제 해결 못함
public class Resovle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = { 10, 99, 2, 78, 32 };
		int i, j, k, temp;

		for (i = numArr.length; i >= 0; i--) {
			k = numArr.length - i;
			for (j = k; j < 0; j--) {
				if (numArr[j] < numArr[j - 1]) {
					temp = numArr[j];
					numArr[j] = numArr[j - 1];
					numArr[j - 1] = temp;
				}
			}

		}
//			
//		for(int i=eng.length-1;i>=0;i--) // tutor 풀이보고 수정 =eng.length-1
//			System.out.print(eng[i] + " ");
		System.out.println();

		System.out.println(Arrays.toString(numArr));
//		System.out.println("최소값 : " + num[0]);
//		System.out.println("최대값 : " + num[4]);
	}

}
