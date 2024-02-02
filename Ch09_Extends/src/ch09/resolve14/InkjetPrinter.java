package ch09.resolve14;

public class InkjetPrinter extends All{
	protected int ink = 100; // 잉크 잔량
	
	public InkjetPrinter(String name, String company, String kindOfInterface, int numOfPrint) {
		super(name, company, kindOfInterface, numOfPrint);
		this.ink = ink;
	}
	
	@Override
	public int now() {
		int rest = numOfPrint-1;
		return rest;
		
	}
	
	@Override
	public void printer() { // 부모의 기능 + 추가 확장
		super.printer(); // All의 printerInfoInfo() 샐행
		System.out.println("잉크 진량 : " + ink);
		System.out.printf("남은 인쇄 매수 : %d \n", now()); //.2f = 소수점둘째자리까지 출력
		
	}
}
