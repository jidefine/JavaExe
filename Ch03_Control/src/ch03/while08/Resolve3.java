package ch03.while08;

public class Resolve3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1; // 초기식(시작: 언제부터)
		int sum = 0;
		while(i<11) { // 조건식(종료: 언제까지)
			sum+=i;
			i++; // 증감식(변화: 얼마만큼)
		}
		System.out.print("1~10까지의 합은 " + sum);
	}


}
