package ch09.interface13;

import ch09.interface13.factory01.FordCar;
import ch09.interface13.factory01.HyundaiCar;
import ch09.interface13.factory01.ToyotaCar;
import ch09.interface13.order01.CarTester;

//[시나리오]
//비트캠프는 자동차 산업을 진출하기 위해 자동차를 OEM 생산주문 하기로 결정
//자동차의 Specification를 각 자동차 제조사에 제공하기 위해
//interface를 사용해서 구현해야 할 기능을 메서드를 정해서 자동차 제조사에 보냄
//
//2. A 자동차 제조사
//	현대, 토요타, 포드는 ICar를 상속받아서 구현 클래스를 생성
//	이 구현 클래스는 메서드 기능은 각 회사의 기술력이 담겨질 것
//	구현 클래스가 완성되면 비트캠프에 보내서 테스트 진행 예정
//2. B 비트캠프
//    자동차 제조사에서 구현 클래스(자동차)를 만드는 동안
//    비트캠프는 이미 정해진 약속인 ICar를 토대로 CarTester클래스를 제작
//    
//3. 자동차제조사는 모두 자동차(구현클래스)를 완성해서 납품하였다.
//Bitcamp는 Main에서 자동차 객체를 생성하고
//CarTester객체에 주입하여 각 자동차의 테스트를 진행한다.
//
//4. 테스트 후 최종 점수를 비교하여 제조사를 선택한다.
public class CarMain {
	
public static void main(String[] args) throws InterruptedException {
	CarTester carTester = new CarTester();
	ICar[] carArr = new ICar[] {
			new HyundaiCar(),
			new ToyotaCar(),
			new FordCar()
	};
	int[] score = new int[carArr.length];
	
	for(int i=0;i<carArr.length; i ++) {
		/* [객체 지향 관련 용어]
		 * (Dependency Injection) : 의존성 주입
		 * IoC(Inversion of Control) : 역제어
		 */
		carTester.setCar(carArr[i]); // 실제 제어는 ICar의 carArr[]배열이 함
		
		score[i] += carTester.onOffTest();
		System.out.printf("---OnOff 테스트 점수는 %d입니다\n", score[i]);
		score[i] += carTester.speedTest();
		System.out.printf("---Speed 테스트 점수는 %d입니다\n", score[i]);
		score[i] += carTester.footBreakTest();
		System.out.printf("---Break 테스트 점수는 %d입니다\n", score[i]);
		score[i] += carTester.driveTest();
		
		System.out.printf("전체 테스트 점수는 %d입니다", score[i]);
		System.out.println("---------------------------------------");
	}
	int max = score[0];
	int maxIdx = 0;
	for(int i =1; i<score.length; i++) {
		if(max < score[i]) {
			max = score[i];
			maxIdx = i;
		}
			
	}
	System.out.printf("가장 높은 점수를 받은 차는 %d번째 차이고 점수는 %d입니다\n",
			maxIdx+1, max);
	System.out.println(carArr[maxIdx].getClass().getName()); // 모르겠음
}
}
