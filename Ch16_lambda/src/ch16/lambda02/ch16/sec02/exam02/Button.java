package ch16.lambda02.ch16.sec02.exam02;

public class Button {
	//정적 중첩 인터페이스(내부에서 사용하는 인터페이스)
		@FunctionalInterface
		public static interface ClickListener {
			//추상 메소드
			void onClick();
		}
		
		//필드
		private ClickListener clickListener;
			
		//메소드
		// 외부로 람다식 전달가능하게 만듦
		public void setClickListener(ClickListener clickListener) {
			this.clickListener = clickListener;		
		}
		
		public void click() {
			this.clickListener.onClick();
		}
}
