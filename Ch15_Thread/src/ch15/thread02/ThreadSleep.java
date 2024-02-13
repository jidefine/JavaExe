package ch15.thread02;

public class ThreadSleep {
public static void main(String[] args) {
	int sum = 0;
	
	Thread t1 = new Thread(new Runnable() {

		@Override
		public void run() {
			int sum = 0;
			for(int i=0; i <10;i++) {
				sum
				+= i;
				System.out.println("누적합= " + sum);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("총합은 " + sum);
			Thread workThread = Thread.currentThread();
			System.out.println(workThread.getName() + " 스레드 종료");
		}
		
	});
	t1.start();
	//
	try {
		// VM(가상 머신) 내의 스레드 종료 신호를 기다리면서 멈춰있음
		// run()이 리턴되면 스레드는 종료 신호를 VM에 보냄
		// 종료 신호(Signal)가 오면 join() 리턴
		// sleep 보다는 정확함
		t1.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	Thread mainThread = Thread.currentThread();
	System.out.println(mainThread.getName() + " 스레드 종료");
}
}
