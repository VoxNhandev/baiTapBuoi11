package bai2;

import java.util.Scanner;

public class CanBo {
	protected String fullName;
	protected int age;
	protected String sex;
	protected String address;
	
	public CanBo() {
		
	};
	
	public CanBo(String fullName, int age, String sex, String address) {
		this.fullName = fullName;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
