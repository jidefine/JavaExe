package ch09.resolve14.answer03;

public class BaseBallMain {
	public static void main(String[] args) {
		GeneratorThreeNum2 generatorNums = new GeneratorThreeNum2();
		BaseBallMenu userNumsMenu = new BaseBallMenu();
		DecisionBall result = new DecisionBall();
		
		generatorNums.num1();
		generatorNums.num2();
		generatorNums.num3();
//		int[] userNums = userNumsMenu.userNums(); // 사용자 입력을 변수에 저장
        result.decision(generatorNums, userNumsMenu);
		result.result();
	}
}
