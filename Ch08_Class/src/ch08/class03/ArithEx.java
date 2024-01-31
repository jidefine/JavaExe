package ch08.class03;
/* static 메서드는 객체를 만들지 않아도 바로 사용가능하다.
 * */
public class ArithEx {
	
	public static void main(String[] args) {
		int a=10, b=5;
		int result = 0;
		
		result = Arith.add(a, b);   // static을 사용하면 클래스 이름을 통해 언제든지 호출 가능
		System.out.println(result); // static을 사용하면 범용적인 기능의 함수를 만들 때 
		result = Arith.sub(a, b);   // static은 항상 메모리에 올라가 있음
		System.out.println(result);
		result = Arith.mul(a, b);
		System.out.println(result);
		result = Arith.div(a, b);
		System.out.println(result);
	}
}
