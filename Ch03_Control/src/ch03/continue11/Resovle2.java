package ch03.continue11;

// 다시 풀어봐야 함
// for문을 이용해서 아래 출력
//*
//**
//***
//****
//*****
public class Resovle2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {     //가로행j의 변화
			for (int j = 1; j <= i; j++) { //세로열i이 같음
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
