package ch09.resolve14.answer02.company;

import ch09.resolve14.answer02.ITablet;

public class LG implements ITablet{

	@Override
	public void movie() throws InterruptedException {
		System.out.println("영화가 고화질로 실행된다~L");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

	@Override
	public void music() throws InterruptedException{
		System.out.println("음질이 무난하다~L");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

	@Override
	public void readBook() throws InterruptedException{
		System.out.println("스크롤이 자연스럽다~L");
		Thread.sleep((long)(Math.random()*500) + 500);
		
	}

}
