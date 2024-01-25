package ch03.for10;

public class Resolve6 {

	public static void main(String[] args) {
		// 1~10 합 출력
				/* while은 조건을 검사하고 실행하는 반면,
				 * do~while은 1번은 무조건 실행하고난 후
				 * 조건을 검사하여 반복 결정
				 */
			int i = 1; //초기값
			int sum = 0;
			do {
				sum+=i;
				i++;
			}while(i<=10);// 조건(언제까지)
			System.out.print("1~10까지의 합은 " + sum);


	}

}
