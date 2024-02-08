package ch14.exception01.ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		// 1) 로직 실행 영역
		try {
			int result = data.length();
			System.out.println("믄자 수: " + result);
		} 
		// 2) try에서 발생한 NullPointerException 에외를 받아서 처리하는 영역
		catch(NullPointerException e) {
			System.out.println(e.getMessage()); // e는 객체 정보가 담겨있음
			//System.out.println(e.toString()); // 오류 원인을 알려줌
			//e.printStackTrace(); // 어느 위치에 오류가 발생했는지를 알려주지만 계속 실행은 됨
		} 
		// 3) try가 실행되었든 catch가 실행되었든
		// 무조건 마무리로 실해되어야 되는 영역
		// 없어도 되는 부분임
		finally {
			System.out.println("[마무리 실행]");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
