package bai2;

public class NhanVien extends CanBo {
	private String task;

	public NhanVien() {
	}

	public NhanVien(String fullName, int age, String sex, String address, String task) {
		super(fullName, age, sex, address);
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "ten: " + this.fullName + " / tuoi: " + this.age + " / gioi tinh: " + this.sex + " / dia chi: " + this.address + " / nhiem vu: " + this.task ;
	}
	
	
	
	
	
	

}
