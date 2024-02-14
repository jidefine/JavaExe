package ch16.lambda03.funcinter01;
/* 추상메서드가 1개를 초과하면 에러가 발생함
 * 함수형 인터페이스는 반드시 추상메서드가 1개여야 함
 */
// @FunctionalInterface : 함수형 람다식을 위한 인터페이스
@FunctionalInterface
public interface MyNumber {
	// 추상 메서드
	// 람다식은 추상 메서드가 무조건 하나여야 한다
	int getMax(int num1, int num2);da03 Lambda 예제 및 설명)
}
