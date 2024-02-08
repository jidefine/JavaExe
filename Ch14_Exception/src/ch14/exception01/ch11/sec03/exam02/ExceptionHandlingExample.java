package ch14.exception01.ch11.sec03.exam02;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array["+i+"]: "+ value);
			} catch(ArrayIndexOutOfBoundsException e) { // 예외는 순서대로 처리함
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(Exception e) { // 모든 예외를 다 받을 수 있는 부모 클래스임
				System.out.println("숫자로 변환할 수 없음: "+e.getMessage());
			}
			
		}
	}
}
