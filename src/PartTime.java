
public class PartTime extends Employee {
	
	private int hoursPerWeek;
	
	public PartTime(String name, double salary, String ssn, int hoursPerWeek) {
		super(name, salary, ssn);	
	}

	

	@Override
	public double getPay() {
		
		return this.salary * hoursPerWeek * 2;
	}
	
	
	
}
