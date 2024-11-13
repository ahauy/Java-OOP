package bai03;
import bai02.DiaChi;

public class NhanVien {
	// thuoc tinh :
	private String name, dob;
	private char gender;
	private DiaChi address;
	
	// ham tao khong doi so :
	public NhanVien() {}

	public NhanVien(String name, String dob, char gender, DiaChi address) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public DiaChi getAddress() {
		return address;
	}

	public void setAddress(DiaChi address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", dob=" + dob + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
}

