package ch08.class06;
//클래스로 묶은 변수를 쉽게 접근 허용하는 것은
//프로그래밍의 오류를 가져오게 되는 중대한 원인이 된다는 사실을
//경험적으로 알게 되었다.
//그래서 클래스 내부에서만 사용한다는 개념(private)과
//밖에서도 접근한다는 개념(public)이 등장하게 되었다.

//[객체지향의 기본 원칙]
//필드 변수 : private을 해주는 관습이 있음(외부 직접 접근 불허)
//메서드 : public을 해주는 관습이 있음(외부 사용 가능)
public class Human {
	private String name;
	private int age;
	private double score;

//	Setter
	public void setName(String _name) { // 기본적으로 변수는 첫번째 단어는 소문자로,
		name = _name;                   // 두번째 단어의 첫 글자는 대문자로 함
	}

	public void setAge(int _age) {
		if (_age < 0)
			return; // void 메서드일때는 그냥 종료
		age = _age;
	}

	public void setScore(double _score) { //함수는 기본적으로 public으로 함
		if (_score < 0)
			return;
		score = _score;
	}
	
	//Getter
	public String getName() { //getter를 통해 값을 꺼냄
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getScore() {
		return score;
	}
}
