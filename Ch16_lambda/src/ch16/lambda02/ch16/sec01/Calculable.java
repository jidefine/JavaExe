package ch16.lambda02.ch16.sec01;

@FunctionalInterface
public interface Calculable {
	//추상 메소드
	//인터페이스는 단 하나의 추상 메서드를 가져야한다
		void calculate(int x, int y);
}
