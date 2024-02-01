package ch09.resovle07;

public class ArrayUtility2 {
    // static 메서드: 두 배열을 연결한 새로운 배열 리턴
    public static int[] concat(int[] s1, int[] s2) {
        if (s1 == null && s2 == null) {
            return null; // 두 배열이 모두 null이면 null 반환
        } else if (s1 == null) {
            return s2.clone(); // s1이 null이면 s2 배열을 복사하여 반환
        } else if (s2 == null) {
            return s1.clone(); // s2가 null이면 s1 배열을 복사하여 반환
        }

        int length1 = s1.length;
        int length2 = s2.length;
        int[] result = new int[length1 + length2];

        // 첫 번째 배열 복사
        System.arraycopy(s1, 0, result, 0, length1);
        // 두 번째 배열 복사
        System.arraycopy(s2, 0, result, length1, length2);

        return result;
    }

    // static 메서드: s1에서 s2 배열의 숫자를 모두 삭제한 새로운 배열 리턴
    public static int[] remove(int[] s1, int[] s2) {
        if (s1 == null || s2 == null) {
            return s1 == null ? null : s1.clone(); // 어느 하나가 null이면 나머지 배열을 복사하여 반환
        }

        int[] result = s1.clone();

        for (int value : s2) {
            int index = indexOf(result, value);
            if (index != -1) {
                result = removeElement(result, index);
            }
        }

        return result;
    }

    // 배열에서 특정 값의 인덱스를 찾는 메서드
    private static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // 배열에서 특정 인덱스의 요소를 제거한 새로운 배열을 반환하는 메서드
    private static int[] removeElement(int[] array, int index) {
        int length = array.length;
        if (index < 0 || index >= length) {
            return array.clone(); // 인덱스가 범위를 벗어나면 원본 배열을 그대로 반환
        }

        int[] result = new int[length - 1];

        // 삭제할 인덱스 이전까지 복사
        System.arraycopy(array, 0, result, 0, index);
        // 삭제할 인덱스 이후부터 끝까지 복사
        System.arraycopy(array, index + 1, result, index, length - index - 1);

        return result;
    }

    public static void main(String[] args) {
        // ArrayUtility2 클래스의 메서드 사용 예시
        int[] array1 = {1, 2, 3};
        int[] array2 = {3, 4, 5};

        // 두 배열을 연결한 새로운 배열
        int[] concatenatedArray = ArrayUtility2.concat(array1, array2);
        System.out.print("두 배열을 연결한 배열: ");
        for (int value : concatenatedArray) {
            System.out.print(value + " ");
        }

        // 두 배열에서 중복된 숫자를 제거한 새로운 배열
        int[] removedArray = ArrayUtility2.remove(array1, array2);
        System.out.print("\n두 배열에서 중복된 숫자를 제거한 배열: ");
        for (int value : removedArray) {
            System.out.print(value + " ");
        }
    }
}
