package ch09.resovle07.answer05;

//클래스 설계에서 접근 권한 설정
//1) 필드 -> private
//   메서트 -> pubilc
//2) 메서드 중에 내부에서만 사용하는 메서드 -> private
public class Child {
int ballCnt;
	
	public Child(int ballCnt) {
		this.ballCnt = ballCnt;
	}
	public void give(Child other, int cnt) {
		sub(cnt);
		other.add(cnt);
	}
	public void get(Child other, int cnt) {
		other.sub(cnt);
		add(cnt);		
	}
	public void add(int cnt) {
		this.ballCnt += cnt;
	}
	public void sub(int cnt) {
		this.ballCnt -= cnt;
	}
	public int getBallCnt() {
		return ballCnt;
	}
}
