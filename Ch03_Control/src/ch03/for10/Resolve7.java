package ch03.for10;

public class Resolve7 {

	public static void main(String[] args) {
		// 1~10 합 출력
				/* while은 조건을 검사하고 실행하는 반면,
				 * do~while은 1번은 무조건 실행하고난 후
				 * 조건을 검사하여 반복 결정
				 */
			int num = 1; //초기값
			do {
				if(num % 2 == 0) //1~10 중에 짝수만 출력
					System.out.print(num + " ");
				num++;
			}while(num<=10);// 조건(언제까지)
	}

}
