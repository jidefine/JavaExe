package ch04.primitve;

import java.util.Arrays;

public class RefTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30}; // 배열 클래스
		String name = "홍길동";	  // String 클래스(약식)
		int[] arr1 = new int[3]; // 정석
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		String name1 = new String("임걱정"); //정석
	
		System.out.println(Arrays.toString(arr));
		System.out.println(name);
		System.out.println(Arrays.toString(arr1));
		System.out.println(name1);
		
		System.out.println(arr.hashCode());
		System.out.println(name.hashCode());
		System.out.println(arr1.hashCode());
		System.out.println(name1.hashCode());
	}

}
