package ch09.resovle07;
/*2. 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의합니다
   생성과 동시에 초기화가 가능한 생성자도 정의합니다
   밑변과 높이 정보를 변경시킬 수 있는 메소드를 정의합니다
   삼각형의 넓이를 계산해서 반환하는 메소드도 정의합니다
   객체를 만들어서 사용해보세요
 */
public class Triangle {
    private double base; // 밑변
    private double height; // 높이

    // 생성자: 밑변과 높이 정보를 초기화하는 생성자
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // 밑변과 높이 정보를 변경하는 메서드
    public void setDimensions(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // 삼각형의 넓이를 계산해서 반환하는 메서드
    public double calculateArea() {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        // Triangle 객체 생성과 메서드 활용 예시
        Triangle triangle = new Triangle(5.0, 3.0);
        
        // 초기 정보 출력
        System.out.println("삼각형의 초기 정보:");
        System.out.println("밑변: " + triangle.base + ", 높이: " + triangle.height);
        System.out.println("넓이: " + triangle.calculateArea());

        // 정보 변경 후 출력
        triangle.setDimensions(7.0, 4.0);
        System.out.println("\n삼각형의 변경된 정보:");
        System.out.println("밑변: " + triangle.base + ", 높이: " + triangle.height);
        System.out.println("넓이: " + triangle.calculateArea());
    }
}
