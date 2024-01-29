package ch05.array04;

public class Resolve4 {
	public static void main(String[] args) {
		
//		int[] num = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
		
		int[] num = new int[10]; //tutor 풀이 추가
		
		for(int i=0; i<num.length;i++) {
			num[i] = 3*(i+1);
		}
		
		for(int i=num.length-1;i>=0;i--)
			System.out.print(num[i] + " ");
		System.out.println();

	}
}
