package ch17.stream01;

import java.util.Arrays;

public class StreamForEach {
	public static void main(String[] args) {
		int[] arr = {10, 20, 99, 2, 77, 3};
		
		//출려방법 1
		System.out.println(Arrays.toString(arr));
		
		//출려방법 2
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
		
		//출려방법 3
		for(int e : arr)
			System.out.print(e + ", ");
		System.out.println();
		
		//출려방법 4 : stream 사용(+ 람다식)
		//forEach : 하나씩 값을 꺼내자
		Arrays.stream(arr).forEach(n->System.out.print(n + ", "));
	}
}
