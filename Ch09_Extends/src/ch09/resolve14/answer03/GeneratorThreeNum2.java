package ch09.resolve14.answer03;

import java.util.Arrays;

public class GeneratorThreeNum2 implements ThreeNum {
	int[] Nums = new int[3];

	@Override
	public void num1() {
		// Math.random을 사용해서 0.0~10.0 미만의 실수를 랜덤으로 생성
		// 실수형의 난수를 생성하기 때문에 정수형으로 변환
		this.Nums[0] = (int)(Math.random() * 10); 
		System.out.println("num1 : " + Nums[0]);
		
	}

	@Override
	public void num2() {
		do {
			this.Nums[1] = (int)(Math.random() * 10);
		}while(Nums[1] == Nums[0]); // num2과 num1가 같으면 다시 난수 생성
		System.out.println("num2 : " + Nums[1]);
	}

	@Override
	public void num3() {
		do {
			this.Nums[2] = (int)(Math.random() * 10);
		}while(Nums[2] == Nums[1] && Nums[2] == Nums[1]); // num3과 num1, 2가 같으면 다시 난수 생성
		System.out.println("num3 : " + Nums[2]);
	}
    
//	public static void main(String[] args) {
//		GeneratorThreeNum2 run = new GeneratorThreeNum2();
//		run.num1();
//		run.num2();
//		run.num3();
//        int[] Nums = run.Nums;
//		System.out.println(Arrays.toString(Nums));
//	}
}
