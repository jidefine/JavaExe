package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		num = sc.nextInt();
		
		while(num >= 0) {
			if(num > 0)
				sum+=num; // 증가
			else
				System.out.println(sum); // 실행
				sc.close();
		}
			
	}

}
