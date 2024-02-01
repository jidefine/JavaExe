package ch09.resovle07;

public class Child {
    private int numberOfBeads; // 어린이가 가지고 있는 구슬 개수

    // 생성자: 어린이의 초기 구슬 개수 설정
    public Child(int numberOfBeads) {
        this.numberOfBeads = numberOfBeads;
    }

    // 메서드: 다른 어린이에게 구슬을 주는 행동을 표현
    public void giveBeads(Child otherChild, int beadsToGive) {
        // 주려는 구슬의 양이 양수이고, 자신이 가지고 있는 구슬이 충분한 경우
        if (beadsToGive > 0 && numberOfBeads >= beadsToGive) {
            numberOfBeads -= beadsToGive; // 자신의 구슬 개수에서 주는 양을 감소
            otherChild.receiveBeads(beadsToGive); // 다른 어린이에게 구슬을 주는 메서드 호출
            System.out.println("구슬 " + beadsToGive + "개를 주었습니다.");
        } else {
            System.out.println("구슬을 주거나 주려는 양이 부적절합니다.");
        }
    }

    // 메서드: 구슬을 받는 행동을 표현
    public void receiveBeads(int beadsToReceive) {
        numberOfBeads += beadsToReceive; // 받은 양만큼 구슬 개수 증가
        System.out.println("구슬 " + beadsToReceive + "개를 받았습니다.");
    }

    // 메서드: 어린이의 현재 구슬 개수를 출력
    public void displayNumberOfBeads() {
        System.out.println("보유 구슬 개수: " + numberOfBeads + "개");
    }

    public static void main(String[] args) {
        // 어린이1의 초기 보유 구슬 개수: 15개
        Child child1 = new Child(15);
        // 어린이2의 초기 보유 구슬 개수: 9개
        Child child2 = new Child(9);

        // 1차 놀이에서 어린이1이 어린이2에게 구슬 2개를 줌
        child1.giveBeads(child2, 2);

        // 2차 놀이에서 어린이2가 어린이1에게 구슬 7개를 줌
        child2.giveBeads(child1, 7);

        // 각 어린이가 보유한 구슬 개수 출력
        System.out.println("\n어린이1:");
        child1.displayNumberOfBeads();

        System.out.println("\n어린이2:");
        child2.displayNumberOfBeads();
    }
}
