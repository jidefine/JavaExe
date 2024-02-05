package ch09.resolve14.tutor.question02.order01;

import ch09.resolve14.tutor.question02.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;
	//의존관계
	/* 외부에서 주입
	 * CarTest는 ICar에 의존적이다.
	 */
	public TabletTester(ITablet tablet) { // 방법 1)
		this.tablet = tablet;
	}
	
	public TabletTester() {         // 방법 2)
		
	}
	
	public void setITablet(ITablet tablet) {
		this.tablet = tablet;
	}
	
	public int movieTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.movie();
			tablet.movie();
			tablet.movie();
		}
		return (int)(Math.random()*50) + 50; // 50이상~99이하
	}
	public int musicTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.music();
			tablet.music();
			tablet.music();
		}
		return (int)(Math.random()*50) + 50; // 50이상~99이하
	}
	public int readBookTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.readBook();
			tablet.readBook();
			tablet.readBook();
		}
		return (int)(Math.random()*50) + 50; // 50이상~99이하
	}
}
