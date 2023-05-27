package bai2;

public class KySu extends CanBo {
	private String facility;

	public KySu() {
	}

	public KySu(String fullName, int age, String sex, String address, String facility) {
		super(fullName, age, sex, address);
		this.facility = facility;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}
	
	@Override
	public String toString() {
		return "ten: " + this.fullName + " / tuoi: " + this.age + " / gioi tinh: " + this.sex + " / dia chi: " + this.address + " / nganh dao tao: " + this.facility ;
	}

}
