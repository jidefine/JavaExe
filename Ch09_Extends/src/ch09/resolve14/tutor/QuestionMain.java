package ch09.resolve14.tutor;

import java.util.Scanner;

public class QuestionMain {
	IQuestionAnswer[] qaArr = {
			new Answer1(),
			new Answer2(),
			new Answer3()
	};
	
	public int getSelectMenuQusetion(Scanner sc) {
		System.out.println("\n\n문제 번호 선택 >> ");
		int num = sc.nextInt();
		return num;
	}
	
	public void printQusetion() {
		for(int i=0; i<qaArr.length; i++) {
			qaArr[i].question();
		}
	}
	
	public static void main(String[] args) {
		QuestionMain qm = new QuestionMain();//객체가 만들어질때, 위의 코드들이 메모리에 올라감
		Scanner sc = new Scanner(System.in);
		boolean isRun = true;
		while(isRun) {
			qm.printQusetion();
			int sel = qm.getSelectMenuQusetion(sc);
			if(sel >=1 && sel <= qm.qaArr.length) {
			IQuestionAnswer iqa = qm.qaArr[sel-1];
			iqa.answer(sc);
			}
			else
				System.out.println("End");
			
		}
		
	}}
