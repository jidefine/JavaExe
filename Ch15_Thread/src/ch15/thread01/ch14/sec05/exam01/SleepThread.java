package ch15.thread01.ch14.sec05.exam01;

import java.awt.Toolkit;

public class SleepThread {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// Interrupt 메서드가 호출되면 실행
			}
		}
	}
}
