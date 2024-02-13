package ch15.thread01.ch14.sec04;

public class ThreadNameExample {
	public static void main(String[] args) {
	Thread mainThread = Thread.currentThread();
	// 내재되어 있는 main 스레드의 기본 이름인 'main'으로 출력
	System.out.println(mainThread.getName() + "실행"); 
	
	for(int i=0; i<3; i++) {
		Thread threadA = new Thread() {
		@Override
		public void run() {
			// 내재되어 있는 스레드 기본 이름으로 출력
			System.out.println(getName() + "실행"); 
		}
		};
		threadA.start(); // 스레드 실행
	}
	Thread chatThread = new Thread() {
		@Override
		public void run() {
			System.out.println(getName() + "실행");
		}
	};
	chatThread.setName("chat-thread"); // 스레드 이름 변경 가능
	chatThread.start();
	}
}
