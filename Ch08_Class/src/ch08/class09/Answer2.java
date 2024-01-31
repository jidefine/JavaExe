package ch08.class09;

import java.util.Scanner;

public class Answer2 {
	// 필드
	private String[] foods;
	private int selectNum;
	private Scanner sc;
	private String name;
	
	public Answer2(Scanner sc, String name, String[] foods) {
		this.sc = sc;
		this.name = name;
		this.foods = foods;
	}
	
	public void viewMenu() {
		System.out.println("-----[" + this.name + "]-----");
		for(int i=0;i<foods.length;i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	public void selectFood() {
		System.out.println("-----[" + this.name + "]-----");
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		System.out.println("-----[" + this.name + "]-----");
		String food = foods[selectNum];
		System.out.println(food + "이 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}
}
