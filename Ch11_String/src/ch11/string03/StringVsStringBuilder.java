package ch11.string03;

public class StringVsStringBuilder {
	/* String : immutable 불변
	 * StringBuilder : mutable 변함
	 * StringBuffer : mutable 변함, 멜티스레드 동기화 처리
	 */
	public static long getStringSpeed() {
		String str = "";
		long start = System.nanoTime();
		for(int i=0; i<26;i++)
			// 순식간에 26개의 공간이 만들고 이를 각각 할당해서 홍길동/홍길동a/......홍길동z
			// 결과적으로는 25개 삭제하고 가장 마지막 것=홍길동z만 남음
			str +=(char)('a' + i); 
		long end = System.nanoTime();
		System.out.println("String: \t" + str);
		
		return end-start;
	}

	public static long getStringBuilderSpeed() {
		StringBuilder strBuilder = new StringBuilder(26);
		long start = System.nanoTime();
		for(int i=0; i<26;i++)
			// 1개의 공간에 변화하는 값 만큼 오른쪽으로 남
			// 결과적으로는 하나의 값=홍길동z만 나옴
			strBuilder.append((char)('a' + i));
		long end = System.nanoTime();
		System.out.println("strBuilder: \t" + strBuilder.toString());
		
		return end-start;
}

	public static void main(String[] args) {
		getStringSpeed();
		getStringBuilderSpeed();
	}
}
