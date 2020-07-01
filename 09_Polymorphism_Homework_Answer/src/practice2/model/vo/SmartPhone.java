package practice2.model.vo;


public abstract class SmartPhone implements CellPhone, TouchDisplay{ 
	
	public SmartPhone() {} // 기본생성자
	
	public abstract void printMaker();
	
}
