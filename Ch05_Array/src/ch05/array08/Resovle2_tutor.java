package ch05.array08;

import java.util.Arrays;
// 다시 풀어봐야 함
public class Resovle2_tutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr= {10, 99, 2, 78, 32, 1, 67};
		int min, max;
		min = max = numArr[0];
//		[min = max = numArr[0];의 대체 방법]
//		int min = numArr[0];
//		int max = numArr[0];
		
		for(int i=1;i<numArr.length;i++) {
			// 최소값
			if(min > numArr[i])
				min = numArr[i];
				
			// 최대값
			if(max < numArr[i])
				max = numArr[i];
//			System.out.print(min + max);
		}
		
		System.out.println("최소값은 " + min);
		System.out.println("최대값은 " + max);
	}

}
