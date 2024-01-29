package ch05.array04;
// 1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class Resolve1 {
	public static void main(String[] args) {
		
		String[] names = new String[] {"a", "b", "c", "d", 
									"e", "f", "g", "h", "i", "j"};
		
		for(int i=0;i<names.length;i++)
			System.out.print(names[i] + " ");
		System.out.println();
		
//		강사 풀이 추가 1)
		for(String name : names) // 교재 189쪽 참고
			System.out.print(name + ", ");
		System.out.println();

	}
}
