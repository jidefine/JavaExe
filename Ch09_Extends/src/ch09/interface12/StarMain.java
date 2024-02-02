package ch09.interface12;

public class StarMain {
	public static void walk(StarUnit[] units) {
		for(StarUnit unit : units) {
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
