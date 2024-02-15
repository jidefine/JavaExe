package ch18.fileio.charstream02;

import java.io.PrintWriter;

public class PrinterWriterStream {
	public static void main(String[] args) {
		Writer wt = new FileWriter("printf.txt");
		PrintWriter out = new PrintWriter(wt);
		out.println("PrintWriter 사용법입니다");
		out.printf("제 나이는 %d살입니다/n", 24);
		out.printf("원주율은 %f입니다/n", 3.14);
		out.println();
		out.println("자바가 좋아요"); // 바이트스크림과 개행문자 아이가 있음?
		out.close();
	}
}
