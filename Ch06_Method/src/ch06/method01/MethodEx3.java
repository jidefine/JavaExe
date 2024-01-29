package ch06.method01;

public class MethodEx3 {
	// num0과 num1은 add함수의 지역변수
	// add함수 종료할 때 num0과 num1은 사라짐
	// 이름만 같은 뿐 전혀 다름
	public static int add(int num0, int num1) {
		int result = num0 + num1;
		return result; //result 값을 가지고 main 메서드로 돌아가라

	}
	
	public static void main(String[] args) {
//		main함수의 지역변수로 Stack에 num0과 num1이 초기화되어 생성
		int num0 = 10, num1 = 5;
		int result = add(num0, num1); // return된 add함수의 result 값이 들어오는 곳
		System.out.println("결과값은 "+ result);
		
		int a = 3, b = 7;
		int result1 = add(a, b);
		System.out.println(result1);
		
	}

}
