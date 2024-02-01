package ch08.class09.answer01;

public class FruitSeller {

	private int numOfApple;
	private int saleMoney;
		
	public FruitSeller(int numOfApple) { // 지역변수가 더 우세
		this.numOfApple = numOfApple;    // 이름이 똑같을 경우에는 지역변수에 this를 붙임
	}
	public int saleApple(FruitBuyer buyer, int money) {
		int num = buyer.buyApple(money);
		numOfApple -= num;
		saleMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + saleMoney);
	}
}
