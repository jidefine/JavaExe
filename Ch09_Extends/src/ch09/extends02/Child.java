package ch09.extends02;

public class Child extends Father {
	float day = 365 + 1.0f / 4; // float형으로 처리됨

	void play() {
		System.out.println("인생이 즐겁다^^");
	}
}
