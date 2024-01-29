package ch05.array08;

import java.util.Arrays;

public class Resovle1 {

	public static void main(String[] args) {

		int[] num= new int[5];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		num[4]=5;
		
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		System.out.println("최소값 : " + num[0]);
		System.out.println("최대값 : " + num[num.length-1]);
//		num.length-1을 놓치지 말 것!
	}

}
