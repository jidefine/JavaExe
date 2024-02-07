package ch11.string02.ch12.sec05;


import java.util.Arrays;

public class ByteToStringExample {
	public static void main(String[] args) throws Exception {
		String data = "자바";
		
		//String -> byte 배열(기본: UTF-8인코딩)
		byte[] arr1 = data.getBytes(); // utf-8,data.getBytes("UTF-8")
		System.out.println("arr1" + Arrays.toString(arr1));
		
		//byte 배열 -> String(기본: UTF-8인코딩)
		String str1 = new String(arr1);
		System.out.println("str1: " + str1);
		
		//String -> byte 배열(EUC-KR인코딩)
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2" + Arrays.toString(arr2));
		
		//byte 배열 -> String(기본: UTF-8인코딩)
		// 상대방이 보낸 파일이 다를 때는 명확하게 byte 단위를 UTF-8으로 변경? 
			String str2 = new String(arr2, "EUC-KR");
			System.out.println("str2: " + str2);
		
	}
}
