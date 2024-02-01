package ch08.class09;

public class Rectangle {
    private int x1, y1, x2, y2;

    // 좌표 설정 메서드
    public void set(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // 사각형 넓이 계산 메서드
    public int square() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    // 좌표와 넓이 등 직사각형 정보 출력 메서드
    public void show() {
        System.out.println("좌표: (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")");
        System.out.println("넓이: " + square());
    }

    // 동일한 좌표의 직사각형인지 확인하는 메서드
    public boolean equals(Rectangle r) {
        return this.x1 == r.x1 && this.y1 == r.y1 && this.x2 == r.x2 && this.y2 == r.y2;
    }

    public static void main(String[] args) {
        // Rectangle 객체 생성과 메서드 활용 예시
        Rectangle rect1 = new Rectangle();
        rect1.set(0, 0, 5, 5);
        rect1.show();

        Rectangle rect2 = new Rectangle();
        rect2.set(0, 0, 5, 5);
        rect2.show();

        System.out.println("두 사각형 동일 여부: " + rect1.equals(rect2));
    }
}
