package ch02.operator04;

public class ComeOperator {
	private void maid() {
		int num0 = 100;
		int num1 = 10;
		int num2 = 100;
		
		boolean bVal = num0 > num1;// 100>10
		System.out.println(bVal); //true
		bVal = num0 < num1; // 100<10
		System.out.println(bVal); //false
		bVal = num0 == num2; // 100 == 100
		System.out.println(bVal); //true
		bVal = num0 >= num2; // 100 >= 100
		System.out.println(bVal); //true

	}
}
