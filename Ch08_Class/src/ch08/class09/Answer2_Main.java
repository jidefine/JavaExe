package ch08.class09;

import java.util.Scanner;

public class Answer2_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Answer2 rest = 
				new Answer2(sc, "중화요리집", 
						new String[]{"짜장면", "짬뽕", "탕수육"});
		
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		
		sc.close();

	}

}
