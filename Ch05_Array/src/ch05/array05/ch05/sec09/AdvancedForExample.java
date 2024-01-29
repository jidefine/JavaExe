package ch05.array05.ch05.sec09;
// 교재 190쪽 공부 필요
public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		for(int score : scores) { // scores 배열의 5개의 항목이 한 번씩 score 변수에
			sum = sum + score;    // 저장되고 sum에 누적됨(반복 횟수 5)
		}
		
//		원래는 아래와 같으나, 편의상 위의 방식으로 코드 작성
//		for(int i = 0;i<scores.length;i++) { 
//		sum += scores[i];

//		[배열 항목 반복을 위한 향상된 for문]
//		for(타입 변수 : 배열){
//		실행문
//		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균 = " + avg);
	}

}
