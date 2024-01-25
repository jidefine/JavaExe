package ch03.while08;

public class Resolve4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		
		while(num<11) { // 조건식(종료: 언제까지)
			if(num % 2 == 0) //1~10 중에 짝수만 출력
				System.out.print(num + " ");
			num++;
		}
		
	}

}
