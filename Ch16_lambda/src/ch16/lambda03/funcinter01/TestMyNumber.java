package ch16.lambda03.funcinter01;

public class TestMyNumber {
	public static void main(String[] args) {
		/* 람다식은 중간의 형식은 배제하고
		 * 결과에 집중하는 방식
		 * 
		 * 아래의 max는 인터페이스의 변수이다
		 * (x, y) -> (x >= y) ? x : y 를 max에 전달하면
		 * 컴파일러는 자동으로 MyNumber를 상속받은 익명의 클래스를 선언하고
		 * 익명 클래스의 객체를 생성해서 max에 전달
		 * 
		 * 그리고 MyNumber의 유일한 추상메서드인 getMax의 내용을
		 * (x, y) -> (x >= y) ? x : y 로 구성해준다
		 * 
		 * max.getMax(10, 20)를 호출하면
		 * x=10, y=20이 전달되게 된다
		 * 
		 */
		MyNumber max = (x, y) -> (x >= y) ? x : y;
		System.out.println(max.getMax(10, 20));
	}
}
//람다식
		// 내부적으로 익명 객체 생성(컴파일러가 알아서 내부에서 이름 알려줌)
		// 최대한 함수를 간단하게 만들려는 산물(결론만 표기)
		// (x, y) ; 매겨변수 x, y
		// (x >= y) ? x : y : x와 y를 비교 후에 x >= y인 경우, x를 출력
