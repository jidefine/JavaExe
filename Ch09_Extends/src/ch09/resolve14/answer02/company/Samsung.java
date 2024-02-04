package ch09.resolve14.answer02.company;

import ch09.resolve14.answer02.ITablet;

public class Samsung implements ITablet{

	@Override
	public void movie() throws InterruptedException {
		System.out.println("영화가 버퍼링 없이 잘 실행된다~SS");
		Thread.sleep((long)(Math.random()*500) + 500);
		//0.0 이상 1.0 미만의 난수(랜덤한 실수)를 생성
		
	}

	@Override
	public void music() throws InterruptedException{
		System.out.println("음질이 꽤 괜찮다~SS");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

	@Override
	public void readBook() throws InterruptedException{
		System.out.println("스크롤이 양호하다~SS");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

}
