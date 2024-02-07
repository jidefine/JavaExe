package ch10.collection02.inkedlist01;
/*1. linkedlist01 패키지 아래의 클래스들을
   배열 -> LinkedList로 변환하세요
 */
public class EmployeeMain {
	
	public static void testInstanceOf() {
		RegularEmployee regEmp =
				new RegularEmployee("1111", "홍길동", 7000, 3000);
		Employee emp = regEmp;
		// instanceof
		if(emp instanceof RegularEmployee)
			System.out.println("emp는 RegularEmployee의 객체이거나 "
					+ "자식 객체입니다.");
		if(emp instanceof TempEmployee)
			System.out.println("emp는 TempEmployee의 객체이거나 "
					+ "자식 객체입니다.");
		if(emp instanceof PartTimeEmployee)
			System.out.println("emp는 PartTimeEmployee의 객체이거나 "
					+ "자식 객체입니다.");
	}
	
	public static void main(String[] args) {
		EmployeeManager em = new EmployeeManager();
		em.run();
//		testInstanceOf();
	}
}
