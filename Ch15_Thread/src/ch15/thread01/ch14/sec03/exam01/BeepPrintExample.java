package ch15.thread01.ch14.sec03.exam01;

// 
import java.awt.Toolkit; // UI 만들때 사용하는 라이브러리

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			// sleep : cpu에게 제어권을 주지마(실행하지마)
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
