package ch09.resolve14;

public class PrinterMain {

	public static void testInstanceOf() {
		InkjetPrinter regPrt =
				new InkjetPrinter("HP10000", "HP", "USB", 2000);
		All prt = regPrt;
		// instanceof
		if(prt instanceof InkjetPrinter)
			System.out.println("prt는 InkjetPrinter의 객체이거나 "
					+ "자식 객체입니다.");
	}
	
	public static void main(String[] args) {
		printerManager pt = new printerManager();
		pt.run();
	}

}
