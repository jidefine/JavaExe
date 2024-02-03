package ch09.resolve14;

public class PrinterMain {

	public static void testInstanceOf(){
		//InkjetPrinter 클래스의 객체 regPrt를 생성
		InkjetPrinter regPrt =
				new InkjetPrinter("HP10000", "HP", "USB", 2000);
		All prt = regPrt; //All 타입의 변수 prt에 할당(다형성)
		if(prt instanceof InkjetPrinter) // instanceof를 통해 객체의 타입을 확인
			System.out.println("prt는 InkjetPrinter의 객체이거나 "
					+ "자식 객체입니다.");
		if(prt instanceof LaserPrinter)
			System.out.println("prt는 LaserPrinter의 객체이거나 "
					+ "자식 객체입니다.");
	}
	
	public static void main(String[] args) {
		// printerManager 객체를 생성해서 pt라는 변수에 대입
		printerManager pt = new printerManager();
		pt.run();
	}

}
