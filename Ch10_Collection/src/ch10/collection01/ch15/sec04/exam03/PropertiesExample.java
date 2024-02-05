package ch10.collection01.ch15.sec04.exam03;

import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		//Properties 컬랙션 생성
		Properties properties  = new Properties();
		
		properties.load(PropertiesExample.class.getResourceAsStream
				("database,properties"));
		
		//주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String usename = properties.getProperty("usename");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		//값 출력
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("usename : " + usename);
		System.out.println("passwordurl : " + password);
		System.out.println("admin : " + admin);
	}

}
