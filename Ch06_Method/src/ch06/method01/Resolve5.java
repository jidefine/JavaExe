package ch06.method01;

/* 5. star(5);
   을 입력하면 
   *
   **
   ***
   ****
   *****
   위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.
*/
public class Resolve5 {
	public static void star(int num) {
		//가로행과 세로열의 * 수가 같음
		for (int i = 1; i <= num; i++) {     //가로행j의 변화
			for (int j = 1; j <= i; j++) { //세로열i의 변화
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		star(5);

	}

}
