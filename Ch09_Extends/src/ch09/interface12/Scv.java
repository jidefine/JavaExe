package ch09.interface12;

class Scv implements StarUnit {

	@Override // 없어도 되지만 인터페이스에서 가져왔다는 것을 지칭(에노테이션?)
	public void walk() {
		System.out.println("스르륵==");
		
	}

	@Override
	public void attack() {
		System.out.println("징징==");
		
	}

	@Override
	public void die() {
		System.out.println("펑==");
		
	}

}
