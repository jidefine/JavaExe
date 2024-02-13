package ch15.thread01.ch14.sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
public static void main(String[] args) {
	// worker 스레드 생성 후, run() 실행
	// 스레드는 가상 머신 안에 있고, 사람한테는 참조값(객체)를 준다?
	// Runnable : interface의 일종
	// 익명 객체
	Thread thread = new Thread(new Runnable() { // Thread 객체 생성
		@Override // Override : 부모가 구현한 메서드를 내가 다시 구현한다
		public void run(){
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {Thread.sleep(500); } catch(Exception e ) {}
				
			}
		}
	});
	// 아래는 main thread
	thread.start(); // 스레드 호출
	
	for(int i=0; i<5; i++) {
		System.out.println("띵");
		try {Thread.sleep(500); } catch(Exception e) {}
	}
}
}
