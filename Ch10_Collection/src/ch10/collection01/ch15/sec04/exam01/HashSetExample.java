package ch10.collection01.ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*Map는 Dictionary, HashTable 구조라고도 한다.
 * 검색에 최적화되어 있는 구조이다
 * Set은 값 자체를 hash값으로 바꿔서 정렬 후 값을 보관
 * 그러나 Map은 key값을 hash값으로 바꿔서 정렬 후 값을 보관
 * 그리고 key hash는 테이블로 만들어 실제 value가 위치힌 취치값을 저장
 * 그래서 key를 넣으면 value를 빠르게 검색할 수 있음
 * 마무리 많은 데이터라도 빠르게 검색할 수 있는 자료구조
 * 데이터베이스의 index가 이 자료구조로 되어 있음
 * 
 * 입력 시는 hash값 정렬이 일어나므로
 * 
 */
public class HashSetExample {
public static void main(String[] args) {
	// Map 컬렉션 생성
	 Map<String, Integer> map = new HashMap<>();
	 
	 //객체 저장
	 map.put("신용권", 85);
	 map.put("홍길동", 90);
	 map.put("동장군", 80);
	 map.put("홍길동", 95); //<-홍길동 key읭 위치에 95를 덮어씀
	 System.out.println("촐 Entry 수: " + map.size());
	 System.out.println();
	 
	 //키로 값 얻기
	 String key = "홍길동";
	 int value = map.get(key);
	 System.out.println(key + ": " + value);
	 System.out.println();
	 
	 //키 Set 컬랙션을 얻고, 반복해서 키와 값을 얻기
	 Set<String> keySet = map.keySet(); //key값만 Set으로 함
	 Iterator<String> keyIterator = keySet.iterator(); // 처음부터 끝까지 접근할 때 Iterator 사용?
	 while (keyIterator.hasNext()) {
		 String k = keyIterator.next();
		 Integer v = map.get(k);
		 System.out.println(k + " : " + v);
	 }
	 System.out.println();
	 
	 //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
	 Set<Entry<String,Integer>> entrySet = map.entrySet();
	 Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
	 while (entryIterator.hasNext()) {
		 Entry<String, Integer> entry = entryIterator.next();
		 String k = entry.getKey();
		 Integer v = entry.getValue();
		 System.out.println(k + " : " + v);
	 }
	 System.out.println();
	 
	 //키로 엔트리 삭제
	 map.remove("홍길동");
	 System.out.println("총 Entry 수: " + map.size());
	 System.out.println();
}
}
