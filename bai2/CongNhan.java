package bai2;

public class CongNhan extends CanBo {
	private int level;

	public CongNhan() {}

	public CongNhan(String fullName, int age, String sex, String address, int level) {
		super(fullName, age, sex, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "ten: " + this.fullName + " / tuoi: " + this.age + " / gioi tinh: " + this.sex + " / dia chi: " + this.address + " / cap bac: " + this.level ;
	}
	
	
	
	
	
	

}
