package ch18.fileio.charstream02;

<<<<<<< HEAD
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderStream {
	public static void main(String[] args) throws IOException {
=======
import java.io.Reader;

public class FileReaderStream {
	public static void main(String[] args) {
>>>>>>> d17d304 (ch18.fileio.charstream02.FileReaderStream 문자스트림 파일 읽기)
		char[] cBuf = new char[10];
		int readCnt = 0;
		Reader in = new FileReader("hyper.txt");
		readCnt = in.read(cBuf, 0, cBuf.length);
<<<<<<< HEAD
		for(int i=0;i<readCnt; i++)
			System.out.println(cBuf[i]);
		in.close();
=======
		for(int i=0; )
>>>>>>> d17d304 (ch18.fileio.charstream02.FileReaderStream 문자스트림 파일 읽기)
	}
}
