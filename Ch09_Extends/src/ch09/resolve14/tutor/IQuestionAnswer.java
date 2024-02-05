package ch09.resolve14.tutor;

import java.util.Scanner;

public interface IQuestionAnswer { 
	public void question();
	public void answer(Scanner sc); // 해답 풀이
	public boolean isRun(); // 계속 진행 여부
}
