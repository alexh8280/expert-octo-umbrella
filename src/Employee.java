
public abstract class Employee {
	
	protected String name;
	protected double salary;
	protected String ssn;
	final int employeeID;
	
	static int nextID = 1;

	public Employee(String name, double salary, String ssn) {
		super();
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
		this.employeeID = nextID++;
	}
	
	public abstract double getPay();
	    
		
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public static int getNextID() {
		return nextID;
	}

	public static void setNextID(int nextID) {
		Employee.nextID = nextID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", ssn=" + ssn + ", employeeID=" + employeeID + "]";
	}
	
	
}
