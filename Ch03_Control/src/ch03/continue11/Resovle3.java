package ch03.continue11;

import java.util.Scanner;

public class Resovle3 {
	public static void main(String[] args) {
		
		int money = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("--------------");
			System.out.println("1.예금 2.출금 3.잔고 4.종료");
			System.out.println("--------------");
			System.out.print("선택 >> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.print("예금액 >> ");
				int deposit = sc.nextInt();
				money += deposit;
			}
			else if(num == 2) {
				System.out.println("출금액 >> ");
				int withdrew = sc.nextInt();
				money -= withdrew;
			}
			else if(num == 3) {
				System.out.println("잔고 >> " + money);
			}
			else
				System.out.println("프로그램 종료");
				if(num == 4) {
					break; // while 무한루프에서는 if문과 괄호를 사용해여 break를 걸어준다.
				}
				
		}

	}
}

