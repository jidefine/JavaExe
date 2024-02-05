package ch09.resolve14.tutor;

import java.util.Scanner;

public class Exit implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "4. Exit";
		
		System.out.println(question);
	}

	@Override
	public void answer(Scanner sc) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isRun() {
		// TODO Auto-generated method stub
		return false;
	}

}
