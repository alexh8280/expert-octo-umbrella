
public class Intern extends Employee {
	
	private int hoursPerWeek;
	private String university;
	private boolean isPaid;
	
	
	public Intern(String name, String ssn, double salary, int hoursPerWeek, String university, boolean isPaid) {
		super(name, salary, ssn);

	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}


	@Override
	public double getPay() {
		if (isPaid == true) {
			return this.salary * hoursPerWeek * 2;
		}
		else
		return 0;
	}
	
	

}
