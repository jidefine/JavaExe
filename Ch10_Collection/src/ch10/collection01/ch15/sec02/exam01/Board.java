package ch10.collection01.ch15.sec02.exam01;

public class Board {
	private String subject; //필드 생성
	private String content; //필드 생성
	private String writer;  //필드 생성
	
	// 매개변수 subject, content, writer를 갖는 Board 객체 생성자 생성
	public Board(String subject, String content, String writer) {
		// Board 객체의 필드들을 매개변수로 받은 값으로 초기화
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	// Board 객체의 subject 필드 값을 String형으로 반환하는 getSubject 메서드
	public String getSubject() {
		return subject; // 
	}
	// Board 객체의 subject 필드 값을 설정하는 메서드
	public void getSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
}
