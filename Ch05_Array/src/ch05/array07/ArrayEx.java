package ch05.array07;

import java.util.Arrays;
import java.util.Scanner;

/* 배열의 정렬
 * Array.sort();
 * Array.parallelSort();
 */

public class ArrayEx {

	public static void main(String[] args) {
		int[] scores = {100, 88, 895, 67, 75};
		System.out.println(Arrays.toString(scores));
		
		// 정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
	}

}
