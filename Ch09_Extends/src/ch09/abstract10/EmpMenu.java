package ch09.abstract10;

public interface EmpMenu {
	//public을 안 붙여도 자동으로 interface는 public으로 인식됨(?)
	public int REG_EMP = 1; 
	public int TEMP_EMP = 2;
	public int PART_EMP = 3;
	public int ALL_EMP = 4;
	public int EXIT = 5;

}
