package ch17.stream01;

import java.util.Arrays;
import java.util.List;

class Customer{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public Customer setName(String name) {
		this.name = name;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Customer setAge(int age) {
		this.age = age;
		return this;
	}
}

public class StreamMap {
	public static void main(String[] args) {
		// Customer 클래스의 customerList 리스트를 Arrays.asList 형태로 배열
		List<Customer> customerList = Arrays.asList(
				new Customer().setName("홍길도").setAge(24),
				new Customer().setName("임꺽정").setAge(33),
				new Customer().setName("일지매").setAge(34),
				new Customer().setName("장길산").setAge(52),
				new Customer().setName("차돌바위").setAge(14),
				new Customer().setName("머털도사").setAge(35)
				);
		/* map(mapping)
		 * 위도, 경도(숫자 2개) => 지도상의 위치
		 * 변환
		 */
		customerList.stream()
					.map(c->c.getName())
					.forEach(s->System.out.print(s + ", "));
		System.out.println();
		
		customerList.stream()
					//AutoBoxing : 내부적으로 int -> object형으로 스트림(성능저하 발생)
					.map(c->c.getAge()) 
					.forEach(s->System.out.print(s + ", "));
		System.out.println();
		
		customerList.stream()
					// int -> int(위보다 성능이 나음)
					.mapToInt(c->c.getAge())
					.forEach(s->System.out.print(s + ", "));
		System.out.println();
		
		int cnt = (int)customerList.stream().count();
		System.out.println("리스트 수는 " + cnt);
		
		int sum = customerList.stream()
				.mapToInt(c->c.getAge())
				.sum();
		System.out.println("총합은 " + sum);
		
		
				
		
	}
}