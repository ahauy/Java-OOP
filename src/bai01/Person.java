package bai01;

public class Person {

	// khai bao thuoc tinh :
	private String name, dob, pob, email, phone;
	private char gender;

	// ham tao khong doi so :
	public Person() {}

	public Person(String name, String dob, String pob, String email, String phone, char gender) {
		super();
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
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

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + "]";
	}
	
	
	
}
