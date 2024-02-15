package ch19.server.ecoserver01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/* 서버는 클라이언트의 접속을 지다린다
 * 스트림이 연결되면 서버<->클라이언드 중 누구나 서로 데이터를 송수신할 수 있다
 * 스트림이 닫히면 더이상 통신되지 않는다 * 
 */
public class EcoServer {
	public static void main(String[] args) {
		final int PORT = 900;
		try {
			ServerSocket server = new ServerSocket(PORT);

			// 클라이언트와 직접 통신(서비스)하는 소켓 객체 리턴
			Socket socket = server.accept();

			// 클라이언트의 접속 신원 확인
			InetAddress inetAddr = socket.getInetAddress();
			System.out.println(inetAddr.getHostAddress() + "로부터 접속");

			/*
			 * Low Level 통신에서는 위의 socket을 통해 직접 통신하지만 우리는 좀더 편리한 통신을 우해 필터클래스를 사용하겠다
			 */
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			// 클라이언트와 통신 시작
			String line;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				System.out.println("클라이언트로부터 수신 : " + line);
				pw.println(line);
				pw.flush();
			}
			System.out.println("클라이언트-서버 종료");
			pw.close();
			br.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
