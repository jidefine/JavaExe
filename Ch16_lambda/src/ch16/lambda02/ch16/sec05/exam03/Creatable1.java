package ch16.lambda02.ch16.sec05.exam03;

@FunctionalInterface
public interface Creatable1 {
	public Member create(String id);// 생성자 메서드 주입
}