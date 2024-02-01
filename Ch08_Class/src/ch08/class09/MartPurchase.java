package ch08.class09;

public class MartPurchase {
	private int money;        // 보유 금액
    private int fruitPrice;   // 과일 가격

    // 메서드: 보유 금액을 설정하는 메서드
    public void setMoney(int money) {
        this.money = money; 
       //this.money는 클래스의 멤버 변수인 money를 나타내고, money는 메서드의 매개변수
       //매개변수로 전달된 값을 클래스의 멤버 변수에 할당
    }

    // 메서드: 과일 가격을 설정하는 메서드
    public void setFruitPrice(int fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    // 메서드: 마트에서 과일을 구매하고 구매 정보를 출력하는 메서드
    public void makePurchase() {
        System.out.println("나는 마트에 가서 " + money + "원을 주고 배 가격 " + fruitPrice + "를 샀다");
    }
    
    public static void main(String[] args) {
        // MartPurchase 객체 생성
        MartPurchase martPurchase = new MartPurchase();
        
        // 보유 금액 설정: 5000원
        martPurchase.setMoney(5000);
        
        // 과일 가격 설정: 2500원
        martPurchase.setFruitPrice(2500);
        
        // 마트에서 과일을 구매하고 구매 정보 출력
        martPurchase.makePurchase();
    }
}
