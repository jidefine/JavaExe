package ch08.class05;
//클래스로 묶은 변수를 쉽게 접근 허용하는 것은
//프로그래밍의 오류를 가져오게 되는 중대한 원인이 된다는 사실을
//경험적으로 알게 되었다.
//그래서 클래스 내부에서만 사용한다는 개념(private)과
//밖에서도 접근한다는 개념(public)이 등장하게 되었다.

//[객체지향의 기본 원칙]
//필드 변수 : private을 해주는 관습이 있음(외부 직접 접근 불허)
//메서드 : public을 해주는 관습이 있음(외부 사용 가능)
public class Human {
	public String name;
	public int age;
	public double score;
	
}