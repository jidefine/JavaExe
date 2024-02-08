package ch13.sec01;
/* Box<String> box1 = new Box<>(); 
 * Box<Integer> box2 = new Box<>();
 * 
 * 위 코드처럼 작성하면 아래처럼 컴파일러는 자동으로 2개의 클래스를 정의
 * class Box_String{
 * 	public String content;
 * }
 * class Box_Integer{
 * 	public Integer content;
 * }
 */
public class GenericExample {

	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		// 자료형이 같으면 오른쪽 편 <>은 비워도 됨
		Box<String> box1 = new Box<>(); 
		box1.content = "안녕하세요."; //Boxing : Heap -> Stack
		String str = box1.content;  //UNBoxing : Stack->Heap 
		System.out.print(str);
		
		//Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100; //Boxing : Heap -> Stack
		int value = box2.content; //UNBoxing : Stack->Heap 
		System.out.print(value);
	}

}
