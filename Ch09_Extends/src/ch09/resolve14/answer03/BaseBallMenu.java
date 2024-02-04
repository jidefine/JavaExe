package ch09.resolve14.answer03;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBallMenu {
	private Scanner sc = new Scanner(System.in);

	public int[] userNums() {
		int[] userNums = new int[3];
		System.out.println("첫번째 숫자 입력 >> ");
		userNums[0] = sc.nextInt();
		System.out.println("두번째 숫자 입력 >> ");
		userNums[1] = sc.nextInt();
		System.out.println("세번째 숫자 입력 >> ");
		userNums[2] = sc.nextInt();
		return userNums; // 입력
	}
	public static void main(String[] args) {
		BaseBallMenu menu = new BaseBallMenu();
        int[] userNums = menu.userNums();
		System.out.println(Arrays.toString(userNums));
	}
}
