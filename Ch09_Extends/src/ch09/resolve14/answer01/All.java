package ch09.resolve14.answer01;

public abstract class All {
	protected String name;
	protected String company;
	protected String kindOfInterface;
	protected int numOfPrint;
	
	// All 클래스의 생성자를 정의
	public All(String modelName, String company, 
			String kindOfInterface, int numOfPrint) {
		this.name = modelName;
		this.company = company;
		this.kindOfInterface = kindOfInterface;
		this.numOfPrint = numOfPrint;
		
	}
	public void printer() {
		System.out.println("----------------------");
		System.out.println("모델명 : " + name);
		System.out.println("제조사 : " + company);
		System.out.println("인터페이스 종류(USB, paraller port) : " + kindOfInterface);
		System.out.println("인쇄매수 : " + numOfPrint);
		
	}
	public abstract int nowPaper();	// 추상메서드

}
