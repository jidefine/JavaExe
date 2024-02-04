package ch09.resolve14.answer03;

public class DecisionBall {
	int[] nums;
	int[] userNums;
	
	public int[] decision(GeneratorThreeNum2 generatorThreeNum2,
			              BaseBallMenu baseBallMenu) {
		int[] nums = generatorThreeNum2.nums();
		int[] userNums = baseBallMenu.userNums();
	}
	
	public void result() {
		while(true) {
			int strike = 0;
			int ball = 0;
			if(nums[0] == userNums[0] 
					&& nums[1] == userNums[1] 
							&& nums[2] == userNums[2])
				break;
				
			for(int i =0; i<nums.length; i++) {
				for(int j = 0; j <nums.length; j++) {
					if(i == j && nums[i] == userNums[j]) {
						strike++;
					}
					else if(nums[i] == userNums[j]) {
						ball++;
					}
					
				}
			}
			System.out.printf("%d스트라이크 %d볼\n", strike, ball);
		}
		System.out.println("==> 삼진아웃!!");
	}
}
