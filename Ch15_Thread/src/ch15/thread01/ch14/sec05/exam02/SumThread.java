package ch15.thread01.ch14.sec05.exam02;

import java.awt.Toolkit;

public class SumThread extends Thread {
	private long sum;
	
	long getSum() {
		return sum;
	}
	
	public void run() {
		for(int i=1; i<=100; i++){
		sum+=i;
		}
		}
}
