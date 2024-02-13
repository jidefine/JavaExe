package ch15.thread01.ch14.sec05.exam03;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA"); 
		WorkThread workThreadB = new WorkThread("workThreadB");
		workThreadA.start();
		workThreadB.start();
		
		// 5초 후에 아무것도 안하고 가만히 있음
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		workThreadA.work = false;
		// 10초 후에 ThreadA와 B 모두 작동
		try {Thread.sleep(10000);} catch (InterruptedException e) {}
		workThreadA.work = true;
	}
}
