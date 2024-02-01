package ch09.resovle07;

public class ArrayUtility {
   // static 메서드: int 배열을 double 배열로 변환
   public static double[] intToDouble(int[] source) {
       if (source == null) {
           return null; // 입력 배열이 null이면 null 반환
       }

       int length = source.length;
       double[] result = new double[length];

       for (int i = 0; i < length; i++) {
           result[i] = (double) source[i]; // 각 요소를 double로 형변환하여 저장
       }

       return result;
   }

   // static 메서드: double 배열을 int 배열로 변환
   public static int[] doubleToInt(double[] source) {
       if (source == null) {
           return null; // 입력 배열이 null이면 null 반환
       }

       int length = source.length;
       int[] result = new int[length];

       for (int i = 0; i < length; i++) {
           result[i] = (int) source[i]; // 각 요소를 int로 형변환하여 저장
       }

       return result;
   }

   public static void main(String[] args) {
       // ArrayUtility 클래스의 메서드 사용 예시
       int[] intArray = {1, 2, 3, 4, 5};

       // int 배열을 double 배열로 변환
       double[] doubleArray = ArrayUtility.intToDouble(intArray);

       // 변환된 double 배열 출력
       System.out.print("double 배열: ");
       for (double value : doubleArray) {
           System.out.print(value + " ");
       }

       // double 배열을 int 배열로 변환
       int[] convertedIntArray = ArrayUtility.doubleToInt(doubleArray);

       // 변환된 int 배열 출력
       System.out.print("\nint 배열: ");
       for (int value : convertedIntArray) {
           System.out.print(value + " ");
       }
   }
}
