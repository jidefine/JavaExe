package ch09.resolve14.tutor.question03;

import java.util.Scanner;

public class BaseBallMenu {
	static Scanner sc = new Scanner(System.in);

	public static void printerOrder(int order) {
		System.out.print(order + "번째 숫자 입력 >> ");
	}

	public static int getUserNum() {
		int num = sc.nextInt();
		return num;
	}

	public static void endInput() {
		sc.close();
	}
}
