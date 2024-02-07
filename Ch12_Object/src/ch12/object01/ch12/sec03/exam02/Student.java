package ch12.object01.ch12.sec03.exam02;

public class Student {
private int no;
private String name;

public Student(int no, String name) {
	this.no = no;
	this.name = name;
}

public int getNo() {return no;}
public String getName() {return name;}

@Override
public int hashCode() { // hashCode는 equals 내의 주소의 번지로 만듦
	int hashCode = no + name.hashCode();
	return hashCode;
}

@Override
//equals와 hashCode 동시에 종종 같이 사용함
public boolean equals(Object obj) { 
	// Student 타입으로 형변환해서 target 매개변수로 들어감
	if(obj instanceof Student target) { 
		if(no == target.getNo() && name.equals(target.getName())) {
			return true;
		}
	}
return false;
}
}
