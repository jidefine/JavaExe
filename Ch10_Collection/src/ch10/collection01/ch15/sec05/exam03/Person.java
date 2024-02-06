package ch10.collection01.ch15.sec05.exam03;

public class Person implements Comparable<Person>{
	public String name;
	public int age;
	public Person(String name, int age) {
	this.name = name;
	this.age = age;
	}
	@Override
	public int compareTo(Person o) {
	// 원하는 값으로 정렬 가능
	if(age<o.age) return -1; //부호를 반대로 바꾸면 반대로 정렬됨
	else if(age == o.age) return 0;
	else return 1;
	
	public int compareTo(Person o) {
		return name.compareTo(o.name);
		// return name.compareTo(o.name)*-1;
	}

	}
}
