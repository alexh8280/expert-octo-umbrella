
public class Consultant extends Employee {
	
	private int contractPeriodInMonths;

	public Consultant(String name, double salary, String ssn, int contractPeriodInMonths) {
		super(name, salary, ssn);
	}

	public int getContractPeriodInMonths() {
		return contractPeriodInMonths;
	}

	public void setContractPeriodInMonths(int contractPeriodInMonths) {
		this.contractPeriodInMonths = contractPeriodInMonths;
	}

	@Override
	public double getPay() {
		
		return this.salary / contractPeriodInMonths / 2;
	}
	
	
	
	

}
