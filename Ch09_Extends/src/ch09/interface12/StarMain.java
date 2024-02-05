package ch09.interface12;

public class StarMain {
	public static void walk(StarUnit[] units) {
		for(StarUnit unit : units) {
			/*StarUnit 클래스에서 unit이라는 지역변수를 선언하고,
			* units 배열의 각 요소를 unit에 할당하여 반복
			*/
			// unit은 현재 반복에서의 현재 요소를 나타내는 지역 변수
			// StarUnit 객체의 배열인 units
			// unit에 어떤 객체가 들어가느냐에 따라 해당 객체의 walk()가 실행됨
			unit.walk();
		}
	}
	public static void attack(StarUnit[] units) {
		for(StarUnit unit : units) {
			unit.attack();
		}
	}
	
	
public static void main(String[] args) {
	// StarUnit 클래스 내에서 배열을 생성하여 StarUnit의 자식(클래스)객체들을 저장하고, 
	// 이 배열을 units 변수에 할당
	StarUnit[] units = new StarUnit[] { 
			new Marine(),
			new Scv(),
			new Hydra()
	};
	
	walk(units);
	attack(units);
}
}
