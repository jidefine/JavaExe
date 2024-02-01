package ch08.class09.answer03;

public class PearSeller {

	private int numOfPear;
	private int saleMoney;
	final int Pear_PRICE = 1000; // 사과가격(상수)
								  //일반적으로 상수를 만들때는 final을 뭍임
		
	public PearSeller(int numOfPear) { // 지역변수가 더 우세
		this.numOfPear = numOfPear;    // 이름이 똑같을 경우에는 지역변수에 this를 붙임
	}
	public int salePear(int money) {
		int num = money/Pear_PRICE;
		numOfPear -= num;
		saleMoney += money;
		return num;
	}
	public void showSaleResult() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과 : " + numOfPear);
		System.out.println("판매 수익 : " + saleMoney);
	}
}
