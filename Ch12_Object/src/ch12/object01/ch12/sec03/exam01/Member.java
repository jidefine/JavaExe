package ch12.object01.ch12.sec03.exam01;
//java의 모든 클래스의 최상위 부모는 object 클래스가 된다.
public class Member {
public String id;

public Member(String id) {
	this.id = id;
}

@Override
//Object의 매개변수로 받아서 어떤 클래스의 어떤 클래스의 인스턴스가 대입될 수 있음
public boolean equals(Object obj) {
	if(obj instanceof Member target) {
		if(id.equals(target.id)) {
			return true;
		}
	}
	return false;
}
}
