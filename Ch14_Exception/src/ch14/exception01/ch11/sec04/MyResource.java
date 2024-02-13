package ch14.exception01.ch11.sec04;

public class MyResource implements AutoCloseable{ // interface 구현
private String name;

public MyResource(String name) {
	this.name = name;
	System.out.println("[MyResource(" + name + ") 읽기]");
}
public String read1() {
	System.out.println("[MyResource(" + name + ") 읽기]");
	return "100";
}
public String read2() {
	System.out.println("[MyResource(" + name + ") 읽기]");
	return "abc";
}
@Override
public void close() throws Exception{ // 일반 예외 처리
	System.out.println("[MyResource(" + name + ") 닫기]");
}
}
