package bai06;

public class Employee extends Person{
	//private String employerName;
	private String dateHired;
	
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, char gender, String dateHired) {
		super(name, age, gender);
		//this.employerName = employerName;
		this.dateHired = dateHired;
	}
//
//	public String getEmployerName() {
//		return employerName;
//	}
//
//	public void setEmployerName(String employerName) {
//		this.employerName = employerName;
//	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", dateHired : " + dateHired; //", employerName : " + employerName
	}
}
