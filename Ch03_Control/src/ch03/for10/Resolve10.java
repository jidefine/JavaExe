package ch03.for10;

public class Resolve10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i =1;i<=10;) { // ;을 통해서 한눈에 볼 수 있도록 사용
			sum+=i;
			i++; // 증감식(변화: 얼마만큼)
		}
		System.out.print("1~10까지의 합은 " + sum);
	}

}
