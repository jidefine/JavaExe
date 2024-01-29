package ch05.array04;

public class Resolve2 {
	public static void main(String[] args) {
		
		String[] eng = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		
		for(int i=eng.length-1;i>=0;i--) // tutor 풀이보고 수정 =eng.length-1
			System.out.print(eng[i] + " ");
		System.out.println();
		
		

	}
}
