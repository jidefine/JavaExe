package ch16.lambda02.ch16.sec05.exam01;

public class Computer {
	// 정적 메소드 static : 메모리에 바로 올라감
	public static double staticMethod(double x, double y) {
		return x + y;
	}
	// 인스턴스 메서드 : 객체가 있어야 메모리에 올라감
	public double instanceMethod(double x, double y) {
		return x * y;
	}
}
