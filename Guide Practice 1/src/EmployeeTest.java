
public class EmployeeTest {
	public static void main(String[] args)
	{
		// instantiate CommissionEmployee object
		CommissionEmployee employee = new CommissionEmployee(
				"CE17", "Sue", "Jones", "222-22-2222", 10000, 0.6);
		
		// get commission employee data
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%n%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%n%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%n%s %s%n", "Employee ID is", employee.getEmployeeID());
		System.out.printf("%n%s %s%n", "Gross sales is", employee.getGrossSales());
		System.out.printf("%n%s %s%n", "Commission rate is", employee.getCommissionRate());
		
		employee.setGrossSales(5000);
		employee.setCommissionRate(0.1);
		
		System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString",
				employee);
		
		// instantiate CommissionEmployee object
				BasePlusCommissionEmployee employee02 = new BasePlusCommissionEmployee(
						"BP28", "Bob", "Lewis", "333-33-3333", 5000, 0.4, 300);
				
				// get commission employee data
				System.out.println("Employee information obtained by get methods:");
				System.out.printf("%n%s %s%n", "First name is", employee02.getFirstName());
				System.out.printf("%n%s %s%n", "Last name is", employee02.getLastName());
				System.out.printf("%n%s %s%n", "Social security number is", employee02.getSocialSecurityNumber());
				System.out.printf("%n%s %s%n", "Employee ID is", employee02.getEmployeeID());
				System.out.printf("%n%s %s%n", "Gross sales is", employee02.getGrossSales());
				System.out.printf("%n%s %s%n", "Commission rate is", employee02.getCommissionRate());
				System.out.printf("%s %.2f%n", "Base salary is", employee02.getBaseSalary());
				
				employee02.setBaseSalary(1000);
				
				System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString",
						employee02);
	} // end main
} // end class EmployeeTest
