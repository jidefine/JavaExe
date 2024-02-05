package ch09.resolve14;

public class InkjetPrinter extends All{
	protected int ink = 100; // 원래 잉크양을 100으로 임의 설정
	//InkjetPrinter 클래스의 생성자를 정의
	public InkjetPrinter(String name, String company, String kindOfInterface, 
															int numOfPrint) {
		//  All 클래스의 생성자를 호출하여 All 클래스의 필드를 초기화
		super(name, company, kindOfInterface, numOfPrint);
	}
	
	public int nowInk() { // 잉크 잔량에 대한 생성자 생성
		int rest = ink - 5; // 인쇄 시 잉크가 5씩 사용되도록 설정
		return rest;
	}
	
	@Override
	public int nowPaper() { // 추상메서드 사용
		int rest = numOfPrint-1; // 인쇄 시 인쇄용지 1매를 사용
		return rest;
	}
	
	@Override
	public void printer() { 
		super.printer(); // All의 printer() 실행
		System.out.println("기존 잉크 : " + ink);
		System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~");
		System.out.printf("잉크 잔량 : %d \n", nowInk());
		System.out.printf("남은 인쇄 매수 : %d \n", nowPaper()); //정수로 출력
		System.out.println();
	}
}
