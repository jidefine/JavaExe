package ch09.hasa08;

public class Police /*extends Gun*/ {
	private int clothes;

	public Police(int clothes) {
		this.clothes = clothes;
	}

	public void putonClothes() {
		if (clothes > 0) {
			System.out.println("SMILE!");
			clothes--;
		} else {
			System.out.println("SHAME...");
		}
	}
}
