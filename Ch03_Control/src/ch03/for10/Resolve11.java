package ch03.for10;

public class Resolve11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int num =1;num<=10;) { // ;을 통해서 한눈에 볼 수 있도록 사용
			if(num % 2 == 0) //1~10 중에 짝수만 출력
				System.out.print(num + " ");
			num++;
		}
	}

}
