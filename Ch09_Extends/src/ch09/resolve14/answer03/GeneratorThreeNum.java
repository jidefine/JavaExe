package ch09.resolve14.answer03;

import ch09.resolve14.answer03.ThreeNum;

public class GeneratorThreeNum implements ThreeNum {
	public int num1;
	public int num2;
	public int num3;
	@Override
	public void num1() throws InterruptedException {
		// Math.random을 사용해서 0.0~10.0 미만의 실수를 랜덤으로 생성
		// 실수형의 난수를 생성하기 때문에 정수형으로 변환
		this.num1 = (int)(Math.random() * 10); 
		System.out.println("num1 : " + num1);
		
	}

	@Override
	public void num2() throws InterruptedException {
		do {
			this.num2 = (int)(Math.random() * 10);
		}while(num2 == num1); // num2과 num1가 같으면 다시 난수 생성
		System.out.println("num2 : " + num2);
	}

	@Override
	public void num3() throws InterruptedException {
		do {
			this.num3 = (int)(Math.random() * 10);
		}while(num3 == num1 && num3 == num2); // num3과 num1, 2가 같으면 다시 난수 생성
		System.out.println("num3 : " + num3);
	}
    
//	public static void main(String[] args) {
//		GeneratorThreeNum run = new GeneratorThreeNum();
//		try {
//            run.num1();
//            run.num2();
//            run.num3();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//	}
}
