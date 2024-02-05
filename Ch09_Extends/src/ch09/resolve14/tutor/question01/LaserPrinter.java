package ch09.resolve14.tutor.question01;

public class LaserPrinter extends Printer {

	protected double tonnerRemainders;
	
	public LaserPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, double tonnerRemainders) {
		super(modelName, manufacturer, pInterface, printCount, paperRemains);
		this.tonnerRemainders = tonnerRemainders;;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();// 종이 1장 사용
		this.printCount++;
		this.tonnerRemainders *= 0.99;
		System.out.println("빠르게 출력된다.");
		System.out.println("품질이 메우 양호하다.");
	}

	@Override
	public String toString() {
		return "LaserPrinter [tonnerRemainders=" + tonnerRemainders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}

	

}
