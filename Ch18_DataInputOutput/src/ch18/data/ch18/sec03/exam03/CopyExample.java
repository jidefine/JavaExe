package ch18.data.ch18.sec03.exam03;

public class CopyExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = "C:/Temp/test.jpg";
		String targetFileName = "C:/Temp/test2.jpg";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);
		
		byte[] data = new byte[1024];
	}
}
