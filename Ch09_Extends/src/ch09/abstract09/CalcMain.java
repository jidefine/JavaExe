package ch09.abstract09;

import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Add add = new Add();
		add.setValue(20, 10);
		System.out.println("add.calculate()=" + add.calculate());

		Sub sub = new Sub();
		sub.setValue(20, 10);
		System.out.println("sub.calculate()=" + sub.calculate());

		Mul mul = new Mul();
		mul.setValue(20, 10);
		System.out.println("mul.calculate()=" + mul.calculate());

		Div div = new Div();
		div.setValue(20, 10);
		System.out.println("div.calculate()=" + div.calculate());

		Scanner sc = new Scanner(System.in);

		boolean isRun = true;
		while (isRun) {
			Calc[] calcs = new Calc[] {add, sub, mul, div};
			System.out.println("[2개의 숫자를 입ㄺ 후 연산]");
			System.out.print("첫번째 수 입력 >> ");
			int num0 = sc.nextInt();
			System.out.print("두번째 수 입력 >> ");
			int num1 = sc.nextInt();
			System.out.println("연산 선택(0 Add, 1 Sub, 2 Mul, 3 Div, 4 Exit >>  ");
			int sel = sc.nextInt();
			if (sel == 4)
				isRun = false;
			else { // 이 부분 이해가 안됨
				calcs[sel].setValue(num0, num1);
				System.out.println("결과는 " + calcs[sel].calculate());
			}
		}
		System.out.println("Program End~");

		sc.close();
	}

}
