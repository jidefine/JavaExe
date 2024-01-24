package ch01.hello; //package는 소속을 의미함

public class Hello {
//	프로그램에서 프로그램 시작부분을 main으로 정해놓았음
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		System.out.println("Hello, Java");
		System.out.println("Hello, 대한민국");
		System.out.println("Hello, NCP08");
		System.out.println("Hello, 이게 되네");
		
		for (int i=0; i<10; i++) {
			System.out.println(i+ ", ");
		}
		
	}
}
