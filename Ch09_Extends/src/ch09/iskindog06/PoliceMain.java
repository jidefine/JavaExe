package ch09.iskindog06;

/* 상속할 때는 고려해야 할 것이 있다.
 * 1) 부모로 정할 클래스와 자식 클래스 간에 
 * 자연스러운 종속 관계인지
 * 자연스러운 종속 관계이면 상속을 고려할 수 있다.
 * 그렇지 않다면 사용하지 않는 것이 좋다.
 * 2)만약 이 예처럼 상속 관계를 정한다면
 *   2-1) 불필요한 기능을 제공함으로써 잘못된 서비스/오류를 야기할 가능성이 매우 높아진다.
 *   2-2) 상속관계를 가지면 부모의 모든 객체는 자식 객체에 포함되므로
 *   메모리 낭비를 가져올 수 있다.
 * 3) 그러므로 Gun - Police의 관계는 상속 < 포함 관계가 더 나을 수 있다.
 */
public class PoliceMain {
	public static void main(String[] args) {
		ForcePolice fp = new ForcePolice(10, 5);
		fp.run();
		fp.fight();
		fp.shot();
		fp.putHandCuff();

		NursePolice np = new NursePolice(10, 5, 3);
		np.calcThermometer(); // 온도를 측정
		np.putHandCuff(); // 수갑을 채운다
		np.shot(); // 빵!
		np.shot(); // 빵!
		np.shot(); // 빵!
	}
}