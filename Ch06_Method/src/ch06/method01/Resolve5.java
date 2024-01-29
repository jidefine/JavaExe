package ch06.method01;

/* 3. int result = total(10, 100);
위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
total메서드를 작성하고 사용해보세요.
*/
public class Resolve5 {
	public static void star(int num) {
		
		for (int i = 1; i <= num; i++) {     //가로행j의 변화
			for (int j = 1; j <= i; j++) { //세로열i이 같음
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		star(5);

	}

}
