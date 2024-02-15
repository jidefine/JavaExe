package ch18.fileio.charstream02;

import java.io.BufferedWriter;

public class StringWriter {
	public static void main(String[] args) {
		// 문자
		Writer wt = new FileWriter("손흥민.txt");
		BufferedWriter out = new BufferedWriter(wt);
		out.write("대한민국 국적의 토트넘 홋스퍼 FC 소속 축구 선수. 주 포지션은 윙어. 현재 토트넘 홋스퍼 FC와 대한민국 축구 국가대표팀의 주장을 맡고 있다.");
		out.newLine();
		out.write("프리미어 리그와 UEFA 챔피언스 리그 아시아 선수 역대 최다 득점자이며 아시아 최초로 발롱도르 후보 30인[33]과 FIFA FIFPro 월드 XI 후보 55인[34]에 선정됐다. ");
		out.newLine();

		out.close();

	}
}