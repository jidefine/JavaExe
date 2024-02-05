package ch09.resolve14.question01;

public class InkjetPrinter extends Printer {

	protected int inkReminders;
	
	public InkjetPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains) {
		super(modelName, manufacturer, pInterface, printCount, paperRemains);
		this.inkReminders = inkReminders;
	}

	@Override
	public void print() {
		super.print();	// 종이 1장 사용
		System.out.println("잉크가 잘 분사되어 출력된다.");
		System.out.println();
	}

	@Override
	public String toString() {
		return "InkjetPrinter [inkReminders=" + inkReminders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}
}
