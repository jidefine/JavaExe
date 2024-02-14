package ch16.lambda03.funcinter02;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 ="Hello";
		String s2 ="World";
		
		// 인터페이스 상속 구현 클래스를 사용해서 출력
		StringConcat concat1 = new StrinfConcatImpl();
		concat1.makeString(s1, s2);
		
		// 람다식으로 구현
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
		
		// 익명 객처로 구현
		StringConcat concat3 = new StrinfConcatImpl() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			};
		};
		concat3.makeString(s1, s2);
		
		//
		ShowMakeString(new StringConcat() {
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			};
		});
		
		//
		StringConcat concat4 = (s, v) -> System.out.println(s + "," + v);
		ShowMakeString(concat4);
		
		ShowMakeString((s, v) -> System.out.println(s + "," + v));
	}
	
	public static void ShowMakeString(StringConcat concat) {
		concat.makeString("헬로", "월드");
	}

}

