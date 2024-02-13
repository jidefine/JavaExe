package ch15.thread01.ch14.sec06.exam01;

public class Calculator {
	private int memory;

	public int getMeomory() {
		return memory;
	}
	// 동기화 메서드
	public synchronized void setMonryl(int memory) {
		this.memory = memory; // 메모리 값 저장
		try {
			Thread.sleep(2000); // 2초간 일시정지
		} catch(InterruptedException e) {}
		// 메모리 값 읽기
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	// 동기화 블록
	public void setMonry2(int memory) {
		synchronized(this) {
			this.memory = memory; // 메모리 값 저장
			try {
				Thread.sleep(2000); // 2초간 일시정지
			} catch(InterruptedException e) {}
		// 메모리 값 읽기
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	}
}
