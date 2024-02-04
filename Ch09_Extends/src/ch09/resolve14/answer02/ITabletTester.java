package ch09.resolve14.answer02;

import ch09.resolve14.answer02.ITablet;

public class ITabletTester {
	private final int TEST_NUM = 3; //테스트 횟수 3
	private ITablet tablet; //tablet은 ITablet 인터페이스를 구현한 객체를 참조하는 변수
	
	 // 생성자를 생성하여, ITablet 인터페이스를 구현한 객체를 전달받아 변수 tablet에 할당
	public ITabletTester(ITablet tablet) {
		this.tablet = tablet;
	}
	// 바로 위의 생성자로 인해 Java가 자동으로 디폴트 생성자를 추가하지 않아서 작성해 줌
	public ITabletTester() {
		
	}

	public void setTablet(ITablet tablet) { //ITablet 타입의 매개변수 tablet을 받음
		this.tablet = tablet; // ITabletTester 클래스 내의 tablet 변수에 할당
	}
	
	public int movieTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.movie();
		}
		return (int)(Math.random()*5) + 5; // 5이상~9이하
		//Math.random : 0.0 이상 1.0 미만의 난수(랜덤한 실수)를 생성
	}
	public int musicTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.music();
		}
		return (int)(Math.random()*5) + 5; // 5이상~9이하
	}
	public int readBookTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			tablet.readBook();
		}
		return (int)(Math.random()*5) + 5; // 5이상~9이하
	}
}
