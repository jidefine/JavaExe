package ch09.resolve14;

import java.util.Scanner;

public class printerManager {
	private final int PRINTER_NUM = 2;// printer 100개가 최대
	private All[] printArr = new All[2];
	private int numOfP = 0; 
	private Scanner sc = new Scanner(System.in);

	private int viewMenu() {
		System.out.println("[ 프린터 선택 ]");
		System.out.println("1. 잉크젯프린터");
		System.out.println("2. 레이저프린터");
		System.out.println("3. 잉크젯프린터 인쇄");
		System.out.println("4. 레이저프린터 인쇄");
		System.out.println("5. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt(); // 번호를 입력받아서 정수형의 sel이라는 변수에 저장
		return sel; // 변수 sel을 리턴
	}

	private InkjetPrinter createInkjetPrinter() {
		System.out.print("모델명 >> ");
		String name = sc.next();
		System.out.print("제조사 >> ");
		String company = sc.next();
		System.out.print("인터페이스 종류(USB, paraller port) >> ");
		String kindOfInterface = sc.next();
		System.out.print("인쇄매수 >> ");
		int numOfPrint = sc.nextInt();
		InkjetPrinter inkP = new InkjetPrinter(name, company, 
									kindOfInterface, numOfPrint);
		return inkP;
	}

	private boolean savePrint(All prt) {
		boolean isSave = true;
		
		if(this.numOfP < PRINTER_NUM) {
			this.printArr[this.numOfP] = prt;
			this.numOfP++;
			isSave = true;
		}else {
			isSave = false;
		}
		return isSave;
	}

	private void startInkjetPrinter() {
		for(int i=0;i<this.numOfP;i++) {
			All prt = this.printArr[i]; 
			if(prt instanceof InkjetPrinter)
				this.printArr[i].printer();
		}
	}
	
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			All prt = null; // null은 객체가 없다는 뜻
			
			switch(selNum){
				case 1:
					prt = createInkjetPrinter();
					break;
				case 2:
					break;
				case 3:
					startInkjetPrinter();
					break;
				case 4:
					prt = null; // null은 객체가 없다는 뜻
					break;
				case 5:
					prt= null;
					isRun = false;
					break;
				default:
					prt = null;
					System.out.println("다시 입력해주세요.");
					break;
			}
			// emp객체가 존재한다면
			if(prt != null) {
				boolean isSave = savePrint(prt);
				if(!isSave) {
					System.out.println("더 이상 저장 공간 없음");
				}
			}
		}
		System.out.println("Exit..");
	}
}
