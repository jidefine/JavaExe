package ch15.thread01.ch14.sec05.exam03;

public class WorkThread extends Thread{
	// 필드
	public boolean work = true;
	
	// 생성자
	public WorkThread(String name) {
		setName(name);
	}
	/* 스레즈의 제어 권한을 다른 스레드에 넘기는 방법
	 * 1) sleep(10;
	 * 10ms 동안 현재 스레드는 스케쥴링에서 제외하겠음
	 * 즉, 다른 스레드에 실행을 넘길꺼임
	 * 난 멈추겠음(입력한 시간 만큼 아무것도 안 할꺼임)
	 * 2) Thread.yield();
	 * 의미없는 일을 하느리 즉시 넘기겠음
	 * 현재 스레드는 스케쥴링에서 넘길꺼임
	 * 즉, 다른 스레드에 실행을 넘길꺼임
	 * 
	 */
	// 메소드
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업 처리");
			} else {
				// cpu의 사용 권한(스케쥴링)을 다른 스레드에 넘김
				Thread.yield();
			}
		}
	}
	
}
