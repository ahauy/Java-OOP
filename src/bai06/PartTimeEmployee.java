package bai06;

public class PartTimeEmployee extends Employee{
	private int hoursPerWeek;
	
	public PartTimeEmployee() {
		super();
	}

	public PartTimeEmployee(String name, int age, char gender, String dateHired, int hoursPerWeek) {
		super(name, age, gender, dateHired);
		// TODO Auto-generated constructor stub
		this.hoursPerWeek = hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	
	@Override 
	public String toString() {
		return super.toString() + ", hoursPerWeek : " + hoursPerWeek;
	}
}
