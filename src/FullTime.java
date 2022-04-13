
public class FullTime extends Employee {
	
	
	public FullTime(String name, double salary, String ssn) {
		super(name, salary, ssn);
		
	}

	
	
	@Override
	public double getPay() {
		
		return (this.salary / 26);
	}



	double calculateBonus() {
		double diff = (this.salary * .15);
		double bonus = (this.salary - diff);
		return bonus;
		
	}
}
