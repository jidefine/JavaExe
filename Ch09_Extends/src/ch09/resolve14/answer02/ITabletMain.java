package ch09.resolve14.answer02;
/*2. ITablet 인터페이스를 만드세요.
   아래 메서드를 멤버로 추가하세요.
   void movie();
   void music();
   void readBook();

   ITablet를 상속받은 삼성, 소니, LG는 Tablet을 구현클래스로 만들고
   OEM을 의뢰한 비트캠프는 TabletTester를 생성합니다.
   이 클래스들이 완성되면 TabletMain에서 테스트를 진행하세요.
   */
import java.util.Arrays;

import ch09.resolve14.answer02.company.LG;
import ch09.resolve14.answer02.company.Samsung;
import ch09.resolve14.answer02.company.Sony;
import ch09.resolve14.answer02.ITabletTester;

public class ITabletMain {
 public static void main(String[] args) throws InterruptedException {
	ITabletTester itabletTester = new ITabletTester();
	ITablet[] tabletArr = new ITablet[] { new Samsung(), new Sony(), new LG()};
	int[] score = new int[tabletArr.length];
	
	for(int i=0;i<tabletArr.length;i++) {
		itabletTester.setTablet(tabletArr[i]);
		
		score[i] += itabletTester.movieTest();
		System.out.println("=> movieTest score : " +  score[i]);
		score[i] += itabletTester.musicTest();
		System.out.println("=> musicTest score : " +  score[i]);
		score[i] += itabletTester.readBookTest();
		System.out.println("=> readBookTest score : " +  score[i]);
		
		System.out.println("-------------------------------");
		System.out.println("total score : " + score[i]);
		System.out.println("-------------------------------");
		System.out.println();
	}
	
	// 가장 큰 점수를 받은 값과 인덱스 찾기
	int max = score[0];
	int maxIdx = 0;
	for(int i=1;i<score.length;i++) {
		if(max < score[i]) {
			max = score[i];
			maxIdx = i;
		}
	}
	System.out.printf("가장 높은 점수를 받은 태블릿은 %d번째 태블릿이고 점수는 %d이다\n", 
																maxIdx, max);
}
}
