package ch09.resolve14.answer01;

public class LaserPrinter extends All{
	protected int toner = 100; // 원래 토너양을 100으로 임의 설정
	////LaserPrinter 클래스의 생성자를 정의
	public LaserPrinter(String name, String company, String kindOfInterface,
															int numOfPrint) {
		// All 클래스의 생성자를 호출하여  All 클래스의 필드를 초기화
		super(name, company, kindOfInterface, numOfPrint);
	}
	
	public int nowToner() { // 토너 잔량에 대한 생성자 생성
		int rest = toner-3; // 인쇄 시 토너가 3씩 사용되도록 설정
		return rest;
	}
	
	@Override
	public int nowPaper() { // 추상메서드 사용
		int rest = numOfPrint-1; // 인쇄 시 인쇄용지 1매를 사용
		return rest;
	}
	
	@Override
	public void printer() {
		super.printer(); // All의 printerInfoInfo() 실행
		System.out.println("기존 토너 : " + toner);
		System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~");
		System.out.printf("토너 잔량 : %d \n", nowToner());
		System.out.printf("남은 인쇄 매수 : %d \n", nowPaper()); //정수로 출력
		System.out.println();
		
	}
}
