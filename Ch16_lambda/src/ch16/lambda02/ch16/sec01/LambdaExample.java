package ch16.lambda02.ch16.sec01;

public class LambdaExample {
	public static void main(String[] args) {
		// (x, y) : 어떤 알파벳으로 지정을 하던 파라미터 갯수만 맞으면 됨
		// 람다식이 2줄 이상이면, 중괄호를 쳐줘야 함
		action((x, y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		// 파라미터가 2개 이상이면 괄호를 쳐줘야 함
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}

	public static void action(Calculable calculable) {
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		calculable.calculate(x, y);
	}
}
