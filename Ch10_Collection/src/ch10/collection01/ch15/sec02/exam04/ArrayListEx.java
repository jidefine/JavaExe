package ch10.collection01.ch15.sec02.exam04;

import java.util.ArrayList;
import java.util.List;

/*자료구조(Data Structure)
 * C : 
 * C++ : STL(Tamplate뭄법으로 생성)
 * C#/jAVA : Collectuon(Generic 문법으로 생성)
 * Python : list, set, tuple, dict
 * 
 * 우리가 만들고자 하는 프로그램의 특성에 맞게 데이터 저장구조를 사용하겠다.
 * 
 */
/* [자바]
 * 클래스는 다중 상속 불가능
 * 인퍼페이스는 다중 상속 가능
 * 인퍼페이스는 메서드만 정해주고 빈 껍데이기에 불가함
 */
/* ArrayList는 배여로 구성되어 있다.\
 * 디민 베얄버디 나은 점은 데이터가 배열을 꽉 채우면 알아서 내부 공간을 늘려준다.
 * 그리고 <>사이에 어떤 자료형을 넣는냐에 따라 해당 자료형을 저장할 수 있다.
 * 
 * List 인터페이스를 상속받았고 List계열 클래스는 List로 변수를 저장해서 사용
 * 리스트의 가장 큰 특징은 '순서가 보장한다."
 * ArrayList의 가장 큰 특징은 '내부가 배열로 이루ㅝ졌다는 것'
 * 
 * 다만, 배열의 크기를 자동으로 늘려준다.
 * 
 * 위 특성을 고려해보면
 * 데이터 양이 많을 때 '삽입', '삭제'가 빈번한 경우는 성능의 저하가 일어난다.
 * 데이터 양이 적을 때는 크게 관계 없다.
 * 
 * 데이터의 양이 많고, 읽기 전용인 경우 그리고 순차 검색인 경우는 가장 빠른 성능을 가지고 있다.
 */
// 지바의 모든 클래스는 Object 클래승 상속되었음
public class ArrayListEx {
	public static void main(String[] args) {
		// <String> → Generic 문법
		// ArrayList 배열을 생설할 것인데, 배열은 String형을 담을 꺼야
		// ArrayList은 내부에서 배열로 저장, 자동으로 용량이 늘어남
		List<String> nameList = new ArrayList<String>();
		
		nameList.add("홍길동");
		nameList.add("임꺽정");
		nameList.add("장길산");
		nameList.add("일지매");
		nameList.add("차돌바위");
		
		System.out.println(nameList.size());
		System.out.println(nameList.get(2));
		System.out.println();
		
		//전체 출력
		for(int i = 0; i<nameList.size();i++)
			System.out.println(nameList.get(i) + " ");
		System.out.println();
		
		nameList.add(2, "머털이"); 	// index 2에 중간 삽입
		
		//전체 출력
		for(int i = 0; i<nameList.size();i++)
			System.out.println(nameList.get(i) + " ");
		System.out.println();
		
		nameList.remove(1);	// index 1을 삭제
		
		// forEach문 사용 가능
				for(String name : nameList)
					System.out.print(name + " ");
				System.out.println();
	}
}
