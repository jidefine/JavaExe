package ch09.resolve14.question01;

public class InkjetPrinter extends Printer {

	protected int inkReminders;// 현재 InkjetPrinter 클래스의 객체(변수)
	
	// InkjetPrinter 클래스의 생성자 생성
	public InkjetPrinter(String modelName, String manufacturer, P_INTERFACE pInterface, int printCount,
			int paperRemains, int inkRemainders, int inkReminders) { // 생성자는 6개의 매개변수를 받음
		// InkjetPrinter 클래스가 상속하는 상위 클래스의 생성자를 호출
		super(modelName, manufacturer, pInterface, printCount, paperRemains);
		/* 객체가 생성될 때
		* .inkReminders을 inkReminders 매개변수 값(입력된 값)으로 할당하여 초기화
		*/
		// this.inkReminders는 현재 InkjetPrinter 클래스의 객체(변수)
		this.inkReminders = inkReminders;
	}

	@Override
	public void print() {
		super.print();	// 종이 1장 사용
		System.out.println("잉크가 잘 분사되어 출력된다.");
		System.out.println("품질이 양호하다.");
	}

	@Override
	public String toString() {
		return "InkjetPrinter [inkReminders=" + inkReminders + ", modelName=" + modelName + ", manufacturer="
				+ manufacturer + ", pInterface=" + pInterface + ", printCount=" + printCount + ", paperRemains="
				+ paperRemains + "]";
	}
}
