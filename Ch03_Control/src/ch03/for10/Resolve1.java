package ch03.for10;

import java.util.Scanner;

public class Resolve1 {

	public static void main(String[] args) {
		
		int money;
//		int coin50000s;
//		int coin10000s;
//		int coin5000s;
//		int coin1000s;
//		int coin500s;
//		int coin100s;
//		int coin50s;
//		int coin10s;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("돈의 액수 >> ");
		money = sc.nextInt();
		
		int coin50000s = money / 50000;
		money = money % 50000;
		int coin10000s = money / 10000;
		money %= 10000;
		int coin5000s = money / 5000;
		money %= 5000;
		int coin1000s = money / 1000;
		money %= 1000;
		int coin500s = money / 500;
		money %= 500;
		int coin100s = money / 100;
		money %= 100;
		int coin50s = money / 50;
		money %= 50;
		int coin10s = money / 10;
		
		System.out.println("오만원 "+ coin50000s + "매");
		System.out.println("만원 "+ coin10000s + "매");
		System.out.println("오천원 "+ coin5000s + "매");
		System.out.println("천원 "+ coin1000s + "매");
		System.out.println("500원 "+ coin500s + "매");
		System.out.println("100원 "+ coin100s + "매");
		System.out.println("50원 "+ coin50s + "매");
		System.out.println("10원 "+ coin10s + "매");
		

	}

}
