package ch05.array08;

import java.util.Arrays;
// 다시 풀어봐야 함
public class Resovle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= new int[5];
		int i, j, k, temp;
		
		num[0]=1;
		num[1]=3;
		num[2]=6;
		num[3]=2;
		num[4]=5;
		
		for(i=0; i<num.length; i++) {
			k = num.length - i;
			for(j = 1; j < k; j++) {
                if (num[j - 1] > num[j]) {
                    temp = num[j - 1];
                    num[j - 1] = num[j];
                    num[j] = temp;
                }
            }

		}
			
		System.out.println(Arrays.toString(num));
//		System.out.println("최소값 : " + num[0]);
//		System.out.println("최대값 : " + num[4]);
	}

}
