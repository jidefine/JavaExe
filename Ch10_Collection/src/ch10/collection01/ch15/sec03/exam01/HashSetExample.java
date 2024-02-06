package ch10.collection01.ch15.sec03.exam01;

import java.util.*; // 이게 뭐지?

/* Set은 집합이다.
 * 집합은 데이터의 모음일 뿐 '순서가 보장되지 않는다.'
 * 그러므로 줄복을 허용하지 않는다.
 * A = {1, 2, 3]
 * B = {3, 4, 5]
 * C = A∪B = {1, 2, 3, 4, 5}
 * 
 * 데이터가 입력될 때 기존 데이터가 있는지 화인한다.
 * 이때 사용하는 알고리즘이 Hash 알고리즘이다.
 */

public class HashSetExample {
public static void main(String[] args) {
	// HashSet 컬렉션 저장
	Set<String> set = new HashSet<String>();
	
	//객체 저장
	set.add("Java");
	set.add("JDBC");
	set.add("JSP");
	set.add("Java"); //<-- 중복 객체이므로 저장하지 않음
	set.add("Spring");
	set.add("python"); // 글자가 1개라도 바뀌면 hash 전체가 다 바뀜
	set.add("Python");
	set.add("Spring");
	
	//저장된 객체 수 출력
	int size = set.size();
	System.out.println("총 객체 수: " + size);
	
	for(String element : set) {
		System.out.println(element);
	}
	
}
}
