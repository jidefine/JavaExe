package ch08.class08;

public class FruitSeller {

	private int numOfApple;
	private int saleMoney;
	final int APPLE_PRICE = 1000; // 사과가격(상수)
								  //일반적으로 상수를 만들때는 final을 뭍임
		
	public FruitSeller(int numOfApple) { // 지역변수가 더 우세
		this.numOfApple = numOfApple;    // 이름이 똑같을 경우에는 지역변수에 this를 붙임
	}
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
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
