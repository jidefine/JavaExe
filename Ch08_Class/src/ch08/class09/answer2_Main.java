package ch08.class09;

import java.util.Scanner;

public class answer2_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		answer2 rest = 
				new answer2(sc, "중화요리집", 
						new String[]{"짜장면", "짬뽕", "탕수육"});
		
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		
		sc.close();

	}

}
