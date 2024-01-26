package ch03.continue11;

import java.util.Scanner;

public class Resovle3 {
	public static void main(String[] args) {
		
		int money = 0;
		System.out.println("--------------");
		System.out.println("1.예금 2.출금 3.잔고 4.종료");
		System.out.println("--------------");
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("선택 >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("예금액 >> ");
				money = sc.nextInt();
			}
			
			
		}
	}
}
