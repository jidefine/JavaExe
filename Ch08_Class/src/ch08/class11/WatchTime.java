package ch08.class11;

/* 메서드(함수)의 오버로딩(Overloading)
 * : java는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러 개 만들 수 있다.
 *   실행할 때 매개변수의 종류에 따라 함수를 구별할 수 있기 때문에
 */
public class WatchTime {
	private int hour, min, sec;
	private String strHour, strMin, strSec;
	private boolean isNum = true;

	public WatchTime(int hour, int min, int sec) {
		System.out.println("this: " + this);
		this.hour = hour; //this는 객체의 레퍼런스 값을 가짐
		this.min = min;
		this.sec = sec;
		this.isNum = true;
	}
	// 앨반 메서드는 객체가 생성딜 때 메모리에 올라감
	public void viewTime() {
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}
	// static 메서드 실행시키자마나 바로 메모리에 올라감
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33); // 객체 생성
		System.out.println("wtNum: " + wtNum);
		System.out.printf("wtNum:%x\n",wtNum.hashCode()); //hashCods는 16진수, 참조변수값
		wtNum.viewTime(); //viewTime(wtNum);

		WatchTime wtNum1 = new WatchTime(13, 23, 53); // 객체 생성
		System.out.println("wtNum: " + wtNum1); //wtNum일 때 사용한 메서드 재사용
		System.out.printf("wtNum:%x\n",wtNum1.hashCode()); //hashCods는 16진수, 참조변수값
		wtNum1.viewTime(); //viewTime(wtNum1);
	} 
}