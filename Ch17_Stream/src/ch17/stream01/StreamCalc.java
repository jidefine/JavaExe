package ch17.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCalc {
public static void main(String[] args) {
	List<String> nameList = new ArrayList();
	nameList.add("홍길동");
	nameList.add("알렉산드라");
	nameList.add("톨스토이");
	nameList.add("김수한무거북이와두르미삼천갑자동방삭");
	nameList.add("Cristoper");
	nameList.add("프랑스대왕루이14세");
	nameList.add("영국헨리8세");
	nameList.add("차이코프스키");
	nameList.add("김주언");
	nameList.add("jay");
	
	//
	for(String name: nameList) {
		if(name.length() >=5) {
			System.out.print(name + ", ");
		}
	}
	System.out.println();
	
	//
	Stream<String> strm = nameList.stream();
	Stream<String> strmf = strm.filter(s->s.length() >=5);
	strmf.forEach(s->System.out.print(s + ", ")); // 스트림은 재사용 불가능
	System.out.println();
	
	//
	nameList.stream()					// 1) 스트림 객체
			.filter(s->s.length() >=5) 	// 2) 중간연산(참일 때 새로운 스트림)
			.filter(s->s.length() <10)
			.forEach(s->System.out.print(s + ", ")); // 3) 최종연산
	
}
}