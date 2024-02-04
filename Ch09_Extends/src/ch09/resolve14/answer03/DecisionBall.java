package ch09.resolve14.answer03;

import java.util.Scanner;

public class DecisionBall {
	int[] nums;
	int[] userNums;
	BaseBallMenu baseBallMenu;  // baseBallMenu 변수 추가
	
	public DecisionBall() { // 생성자에서 배열 초기화
        nums = new int[3];
        userNums = new int[3];
        baseBallMenu = new BaseBallMenu();
    }
	
	public void decision(GeneratorThreeNum2 generatorThreeNum2,
			              BaseBallMenu baseBallMenu) {
		this.nums = generatorThreeNum2.nums();
		this.userNums = baseBallMenu.userNums();
	}
	
	public void result() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int strike = 0;
			int ball = 0;
				
			for(int i =0; i<3; i++) {
				for(int j = 0; j <3; j++) {
					if(i == j && nums[i] == userNums[j]) {
						strike++;
					}
					else if(nums[i] == userNums[j]) {
						ball++;
					}
					
				}
			}
			System.out.printf("%d스트라이크 %d볼\n", strike, ball);
			
			if(strike == 3) {// 모두 일치할 때만 정답으로 처리
				System.out.println("==> 삼진아웃!!");
				System.out.println();
				System.out.println("다시하시겠습니까(Y/N)?");
				String answer = sc.next();
				if(answer == "Y") { // 왜 작동이 안되지?
					userNums = baseBallMenu.userNums();
				}
				else
					break;
			}
			// BaseBallMenu 클래스의 userNums 메서드를 호출하여
			// 사용자로부터 숫자를 입력받고, 그 값을 userNums 배열에 저장
			// 매번 result 메서드가 호출될 때마다 사용자에게 새로운 숫자를 입력받음
			System.out.println();
			userNums = baseBallMenu.userNums();
		}
	}
}
