package ch09.resolve14.tutor;

import java.util.Scanner;

import ch09.resolve14.tutor.question02.ITablet;
import ch09.resolve14.tutor.question02.factory01.LGTablet;
import ch09.resolve14.tutor.question02.factory01.LenovoTablet;
import ch09.resolve14.tutor.question02.factory01.Samsungablet;
import ch09.resolve14.tutor.question02.order01.TabletTester;

public class Answer2 implements IQuestionAnswer {

	private static final ITablet ITablet = null;

	@Override
	public void question() {
		String qusetion = "2. ITablet 인터페이스를 만드세요.\r\n" + "   아래 메서드를 멤버로 추가하세요.\r\n" + "   void movie();\r\n"
				+ "   void music();\r\n" + "   void readBook();\r\n" + "   \r\n"
				+ "   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고\r\n" + "   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.\r\n"
				+ "   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.\r\n\r\n";

	}

	@Override
	public void answer(Scanner sc) {
		sc.nextLine(); // Enter 치기 전까지 멈춰 있음
		TabletTester tabletTester = new TabletTester();
		ITablet[] tabletArr = new ITablet[] { new LenovoTablet(), new LGTablet(), new Samsungablet() };
		int[] score = new int[tabletArr.length];

		for (int i = 0; i < tabletArr.length; i++) {
			/*
			 * [객체 지향 관련 용어] (Dependency Injection) : 의존성 주입 IoC(Inversion of Control) : 역제어
			 */
			tabletTester.setITablet(tabletArr[i]); // 실제 제어는 ICar의 carArr[]배열이 함

			int movie = 0, music = 0, readBook = 0;
			try {
				movie = tabletTester.movieTest();
				System.out.printf("---movie 테스트 점수는 %d입니다\n", movie);
				music = tabletTester.musicTest();
				System.out.printf("---music 테스트 점수는 %d입니다\n", movie);
				readBook = tabletTester.readBookTest();
				System.out.printf("---readBook 테스트 점수는 %d입니다\n", movie);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			score[i] = movie + music + readBook;

			System.out.printf("전체 테스트 점수는 %d입니다", score[i]);
			System.out.println("---------------------------------------");
		}
		int max = score[0];
		int maxIdx = 0;
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
				maxIdx = i;
			}

		}
		System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 차이고 점수는 %d입니다\n", maxIdx + 1, max);
		System.out.println(tabletArr[maxIdx].getClass().getName()); // 모르겠음
		sc.nextLine();
	}

	@Override
	public boolean isRun() {
		// TODO Auto-generated method stub
		return true;
	}

}
