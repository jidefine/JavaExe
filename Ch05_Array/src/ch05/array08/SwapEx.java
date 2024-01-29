package ch05.array08;

public class SwapEx {
	public static void main(String[] args) {
		
//		swap : 두 변수의 값을 서로 바꾼다는 것을 의미한다.
		/*2개 변수의 값을 바꾸려면
		 * Python은 아래처럼 가능
		 * a = 10; 
		 * b = 20; 
		 * a, b = b, a;
		 */
		
		int a = 100;
		int b = 200;
		a = b;
		b = a;
		System.out.printf("a=%d, b=%d", a, b);
		System.out.println();
		
		int num0 = 10;
		int num1 = 20;
		int temp = 0;
		
		temp = num0;
		num0 = num1;
		num1 = temp;
		System.out.printf("num0=%d, num1=%d", num0, num1);
		
	}
}
