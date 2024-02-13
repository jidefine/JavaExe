package ch15.thread01.ch14.sec06.exam02;
/* 순서를 맞춰주는
 * 
 */
// 스레드 배분 시간이 정확하지 않음
public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();

		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);

		threadA.start(); // 먼저 호출해서 먼저 호출될 확률이 있음
		threadB.start();
	}
}
