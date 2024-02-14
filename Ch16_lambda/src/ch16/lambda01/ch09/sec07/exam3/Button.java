package ch16.lambda01.ch09.sec07.exam3;
// 이벤트 처리 프로그램
public class Button {
	//정적 멤버 인터페이스
		public static interface ClickListener {
			//추상 메소드
			void onClick();
		}
		
		//필드
		private ClickListener clickListener;
			
		//메소드
		public void setClickListener(ClickListener clickListener) {
			this.clickListener = clickListener;
		}
		
		public void click() {
			this.clickListener.onClick();
		}
}
