package ch09.interface13.factory01;

import ch09.interface13.ICar;

public class FordCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("FordCar - The engine starts well~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void turnOff()throws InterruptedException {
		System.out.println("FordCar - 시동이 잘 꺼진다~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("FordCar - 엑셀이 가속이 잘된다~F");
		Thread.sleep((long)(Math.random()*500) + 500);
	}

	@Override
	public void footBreak() throws InterruptedException{
		System.out.println("FordCar - 브레이크가 잘 동작된다~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

}
