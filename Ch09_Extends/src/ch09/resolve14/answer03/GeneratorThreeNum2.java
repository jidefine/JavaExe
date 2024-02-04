package ch09.resolve14.answer03;

import java.util.Arrays;

public class GeneratorThreeNum2 implements ThreeNum {
	int[] nums = new int[3];

	@Override
	public void num1() {
		// Math.random을 사용해서 0.0~10.0 미만의 실수를 랜덤으로 생성
		// 실수형의 난수를 생성하기 때문에 정수형으로 변환
		this.nums[0] = (int)(Math.random() * 10); 
		System.out.println("num1 : " + nums[0]);
		
	}

	@Override
	public void num2() {
		do {
			this.nums[1] = (int)(Math.random() * 10);
		}while(nums[1] == nums[0]); // num2과 num1가 같으면 다시 난수 생성
		System.out.println("num2 : " + nums[1]);
	}

	@Override
	public void num3() {
		do {
			this.nums[2] = (int)(Math.random() * 10);
		}while(nums[2] == nums[1] && nums[2] == nums[0]); // num3과 num1, 2가 같으면 다시 난수 생성
		System.out.println("num3 : " + nums[2]);
	}
    
//	public static void main(String[] args) {
//		GeneratorThreeNum2 run = new GeneratorThreeNum2();
//		run.num1();
//		run.num2();
//		run.num3();
//        int[] nums = run.nums;
//		System.out.println(Arrays.toString(nums));
//	}
}
