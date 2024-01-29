package ch05.array08;

import java.util.Arrays;
// 다시 풀어봐야 함
public class Resovle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr= {10, 99, 2, 78, 32};
		int i, j, k, temp;
		
		for(i=0; i<numArr.length; i++) {
			k = numArr.length - i;
			for(j = 1; j < k; j++) {
                if (numArr[j - 1] > numArr[j]) {
                    temp = numArr[j - 1];
                    numArr[j - 1] = numArr[j];
                    numArr[j] = temp;
                }
            }
		

		}
			
		System.out.println(Arrays.toString(numArr));
//		System.out.println("최소값 : " + num[0]);
//		System.out.println("최대값 : " + num[4]);
	}

}
