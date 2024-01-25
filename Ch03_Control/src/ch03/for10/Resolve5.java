package ch03.for10;

public class Resolve5 {

	public static void main(String[] args) {
		// 10~20 출력
				/* while은 조건을 검사하고 실행하는 반면,
				 * do~while은 1번은 무조건 실행하고난 후
				 * 조건을 검사하여 반복 결정
				 */
			int i = 10; //초기값
			do {
				System.out.print(i + " "); // 실행
				i++; // 증가
			}while(i<=20);// 조건(언제까지)


	}

}
