package ch15.thread01.ch14.sec06.exam02;

public class WorkObject {
	// 스레드 1
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		// 아래 부분을 주석처리하면 TreadA와 TreadB가 제각각 동작하는 것을 볼 수 있음
		// 기다리는 다른 스레드는 wait 상태로 들어간다.
		notify();
		try {
			wait(); // 내 스레드는 wait 상태로 들어감
		} catch (InterruptedException e) {
		}
	}
	// 스레드 2
	public synchronized void methodB() {
		 // currentThread: 스레드를 실핸한 이름이 뭐냐(?)
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		// 아래 부분을 주석처리하면 TreadA와 TreadB가 제각각 동작하는 것을 볼 수 있음
		// 기다리는 다른 스레드는 wait 상태로 들어간다.
		notify(); //ThreadB가 깨어남(호출)
		try {
			wait(); // 내 스레드는 wait 상태로 들어감
		} catch (InterruptedException e) {
		}
	}
}
