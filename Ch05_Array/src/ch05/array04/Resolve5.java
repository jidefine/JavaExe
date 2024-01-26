package ch05.array04;

import java.util.Scanner;

public class Resolve5 {
	public static void main(String[] args) {

		int i = 0;
		int[] arr = new int[10]; // 정석
		
		Scanner sc = new Scanner(System.in);
		
		for(int num = 0;num<10;num++) {
			System.out.print("arr["+ num +"] 입력 >> ");
			arr[num] = sc.nextInt();
		}	

//		for(i=0;i<arr.length;i++)
//			System.out.println("arr["+i +"] : " + arr[i]);
//		System.out.println();
		
		int total = 0;
		for(i =0;i<arr.length;i++) {
			total += arr[i];
		}	
		System.out.println("총합: " + total);
		
		sc.close();
	}
}
