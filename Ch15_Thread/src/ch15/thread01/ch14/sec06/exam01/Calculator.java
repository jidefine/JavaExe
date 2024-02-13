package ch15.thread01.ch14.sec06.exam01;

public class Calculator {
	// 이 변수를 2개의 스레드가 동시에  접근할 가능성이 있기 때문에 스레드 동기호시켜줌
	private int memory; 

	public int getMeomory() {
		return memory;
	}
	// 동기화 메서드
	// 동기화를 안한다고 해서 오류가 꼭 나는 것은 아님
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
