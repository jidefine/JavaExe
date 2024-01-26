package ch04.primitve;

class PrimitveTypeEx {
	public static void main(String[] args) {
//		아래 변수는 Stack에 생성되엇다가
//		main의 영역을 벗어나면 Stack에서 사라진다
//		main
		byte b = 10;
		char ch = 'A';
		short s = 10000;
		int i = 99999999;
		long l = 99999999999999L;
		float f = 3.14f;
		double d = 3.14;
		System.out.printf("byte size : %dbit\n", Byte.SIZE);
		System.out.printf("char size : %dbit\n", Char.SIZE);
		System.out.printf("short size : %dbit\n", Short.SIZE);
		System.out.printf("int size : %dbit\n", Int.SIZE);
		System.out.printf("long size : %dbit\n", Long.SIZE);
	}
}
