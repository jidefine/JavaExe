package ch10.collection01.ch15.sec03.exam02;
/*Member객체의 내용(이름, 나이)로 객체가 같은지 다른지 비교하기 위해서는
 * objectfhqnxj 상속 받은 hashcode() equsls()fmf 
 * 
 */
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//hashCode 재정의
	@Override
	public int hashCode() { //비
		return name.hashCode() + age;
	}
	//equals : 물리적인 주소 위치
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age==age);
		}else {
			return false;
		}
	}
}
