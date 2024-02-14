package ch17.stream01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamReduce {
	public static void main(String[] args) {
		//Stream<Intrger> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int[] numArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 배열의 총합을 구하는 수식
		/* reduce()
		   : 2개의 값을 받아서 1개의 값을 리턴하는 함수를 넣어줘야 함
		   : 모든 스트림을 순환
		   
		   a=1 b=2 -> 3
		   a=2 b=3 -> 6
		   a=6 b=4 -> 10
		   ...
		*/
		/*앞의 연산의 결과가 다시 a로 입력되고 
		새로운 배열의 인자가 b로 입력디어
		계속 반복 연산이 진행된다*/
		
		// reduce의 로직은 우리가 직접 구성한다.
		int sum = Arrays.stream(numArr).reduce(0, (a, b) -> a+b);
		System.out.println("sum=" + sum);
		
		//Optional<Integer> sum = Array.stream(numArr).reduce(0, (a, b) -> a+b);
		
		String[] strArr = {"안녕하세요!!!", "hello", "Good morning", "반갑습니다^^"};
		String result = Arrays.stream(strArr).reduce("", (s1, s2) -> {
							if(s1.getBytes().length >= s2.getBytes().length)
								return s1;
							else
								return s2;
		});
		System.out.println("가장 긴 인사말은 " + result);
		}
		
	}
