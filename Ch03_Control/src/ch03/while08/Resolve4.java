package ch03.while08;

public class Resolve4 {

	public static void main(String[] args) {
// 풀이방법 1)
		int num = 1;
		while(num<11) { // 조건식(종료: 언제까지)
			if(num % 2 == 0) //1~10 중에 짝수만 출력
				System.out.print(num + " ");
			num++;
		}
		
// 풀이방법 2) 
//		int num = 2;
//		while(num<=10) { // 조건식(종료: 언제까지)	
//			System.out.print(num);
//			num+=2;
//		}
	}

}
