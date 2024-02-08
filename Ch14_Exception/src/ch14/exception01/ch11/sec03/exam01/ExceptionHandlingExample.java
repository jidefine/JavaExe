package ch14.exception01.ch11.sec03.exam01;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				// 문자열을 Integer로 변환 중 2개의 오류 발생
				// 세밀하게 에외처리를 해줄 때 사용
				// 귀찮으면 그냥 Exception 으로 처리하면 모든 예외를 받을 수 있음
				int value = Integer.parseInt(array[i]); 
				System.out.println("array["+i+"]: "+ value);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			} catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음: "+e.getMessage());
			}
			
		}
	}
}
