package ch09.interface13.order01;

import ch09.interface13.ICar;

public class CarTester {
	private final int TEST_NUM = 3;
	private ICar car;
	//의존관계
	/* 외부에서 주입
	 * CarTest는 ICar에 의존적이다.
	 */
	public CarTester(ICar car) { // 방법 1)
		this.car = car;
	}
	
	public CarTester() {         // 방법 2)
		
	}
	
	public void setCar(ICar car) {
		this.car = car;
	}
	
	public int onOffTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			car.turnOn();
			car.turnOff();
		}
		return (int)(Math.random()*50) + 50; // 50이상~99이하
		//Math.random : 실수값들 중에서 랜덤
	}
	public int speedTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			car.accel();
			car.accel();
			car.accel();
		}
		return (int)(Math.random()*50) + 50; // 50이상~99이하
	}
	public int footBreakTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			car.footBreak();
			car.footBreak();
			car.footBreak();
		}
		return (int)(Math.random()*50) + 50; // 50이상~99이하
	}
	public int driveTest() throws InterruptedException {
		for(int i=0;i<TEST_NUM;i++) {
			car.turnOn();
			car.accel();
			car.accel();
			car.footBreak();
			car.footBreak();
			car.turnOff();
		}
		return (int)(Math.random()*50) + 50; // 50이상~99이하
	}
	

}
