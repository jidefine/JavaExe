package ch09.resovle07;

// Add 클래스: 덧셈을 수행하는 클래스
public class Answer1 {
   private int a, b;

   // 메서드: 값을 설정하는 메서드
   public void setValue(int _a, int _b) {
       a = _a;
       b = _b;
   }

   // 메서드: 덧셈을 수행하고 결과를 반환하는 메서드
   public int calculate() {
       return a + b;
   }
}

//Sub 클래스: 뺄셈을 수행하는 클래스
//public class Sub {
//   private int a, b;
//
//   // 메서드: 값을 설정하는 메서드
//   public void setValue(int _a, int _b) {
//       a = _a;
//       b = _b;
//   }
//
//   // 메서드: 뺄셈을 수행하고 결과를 반환하는 메서드
//   public int calculate() {
//       return a - b;
//   }
//}
//
////Mul 클래스: 곱셈을 수행하는 클래스
//public class Mul {
//   private int a, b;
//
//   // 메서드: 값을 설정하는 메서드
//   public void setValue(int _a, int _b) {
//       a = _a;
//       b = _b;
//   }
//
//   // 메서드: 곱셈을 수행하고 결과를 반환하는 메서드
//   public int calculate() {
//       return a * b;
//   }
//}
//
////Div 클래스: 나눗셈을 수행하는 클래스
//public class Div {
//   private int a, b;
//
//   // 메서드: 값을 설정하는 메서드
//   public void setValue(int _a, int _b) {
//       a = _a;
//       b = _b;
//   }
//
//   // 메서드: 나눗셈을 수행하고 결과를 반환하는 메서드
//   // 주의: 나눗셈은 항상 정수로 가정하여 구현 (소수 부분은 무시)
//   public int calculate() {
//       return a / b;
//   }
//}