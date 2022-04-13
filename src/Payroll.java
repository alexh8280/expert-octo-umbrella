import java.util.Scanner;

public class Payroll {
	
	
	static Employee[] newEmployees = new Employee[2];
	
	static String printMenu() {
		return "Employee types\n\t1. Full-time" + "\n\t2. Part-time\n\t3. Intern" + "\n\t4. Consultant"+ 
				 "\n\t0. Exit system";
	}
	
	public static void main(String[] args) {
	
	
		Employee employees;
		
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		int userChoice;
		
		String name;
		double salary;
		String ssn;
		int hoursPerWeek;
		boolean isPaid;
		int contractPeriodInMonths;
		String university;
		
		do {
			
			System.out.println(printMenu());
			userChoice = input.nextInt();
			input.nextLine();
			
		
		
			if (userChoice == 1) {
				System.out.println("Enter Full-time employee's name:");
				name = input.nextLine();
				System.out.println("Enter Full-time employee's salary:");
				salary = input.nextDouble();
				input.nextLine();
				System.out.println("Enter Full-time employee's SSN:");
				ssn = input.nextLine();
				employees = new FullTime(name, salary, ssn);
				newEmployees[count] = employees;
				count++;
			    }
			
			if (userChoice == 2) {
				System.out.println("Enter Part-time employee's name:");
				name = input.nextLine();
				System.out.println("Enter Part-time employee's salary:");
				salary = input.nextDouble();
				System.out.println("Enter Part-time employee's SSN:");
				ssn = input.nextLine();
				System.out.println("Enter Part-time employee's hours worked per week:");
				hoursPerWeek = input.nextInt();
				
				employees = new PartTime(name, salary, ssn, hoursPerWeek);
				newEmployees[count] = employees;
				count++;
			}
			
			if (userChoice == 3) {
				System.out.println("Enter Intern's name:");
				name = input.nextLine();
				System.out.println("Enter Intern's employee's SSN:");
				ssn = input.nextLine();
				System.out.println("Enter Intern's salary:");
				salary = input.nextDouble();
				System.out.println("Enter Intern's employee's hours worked per week:");
				hoursPerWeek = input.nextInt();
				input.nextLine();
				System.out.println("Enter Intern's University:");
				university = input.nextLine();
				System.out.println("Enter if Intern is paid. (true/false)");
				isPaid = input.nextBoolean();
				
				employees = new Intern(name, ssn, salary, hoursPerWeek, university, isPaid);
				newEmployees[count] = employees;
				count++;
			}
			
			if (userChoice == 4) {
				System.out.println("Enter Consultant's name:");
				name = input.nextLine();
				System.out.println("Enter Consultant's salary");
				salary = input.nextDouble();
				System.out.println("Enter Consultant's SSN:");
				ssn = input.nextLine();
				System.out.println("Enter Consultant's contract period in months:");
				contractPeriodInMonths = input.nextInt();
				
				employees = new Consultant(name, salary, ssn, contractPeriodInMonths);
				newEmployees[count] = employees;
				count++;
			}
		} while (userChoice != 0 && count != 2);
			
			input.close();
		
		for (int i = 0; i <= (newEmployees.length - 1); i++) {
		System.out.println(newEmployees[i]);
			}
	
	}
}
