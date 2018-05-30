
public class EmployeeTest {
	public static void main(String[] args)
	{
		// create five element Employee array
		CommissionEmployee[] employees = new CommissionEmployee[5];
		
		// instantiate CommissionEmployee object
		employees[0] = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222", "CE17", 10000, 0.06);
		employees[1] = new CommissionEmployee(
				"Pat", "Marquet", "555-55-5555", "CE18", 8000, 0.005);
		employees[2] = new CommissionEmployee(
				"Mick", "Johnson", "987-65-4321", "CE19", 11000, 0.07);
		employees[3] = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "333-33-3333", "BP28", 5000, 0.04, 300);
		employees[4] = new BasePlusCommissionEmployee(
				"Mary", "Sanchez", "123-45-6789", "BP29", 6500, 0.05, 250);
		
		// get data of each object in employees array
		for(int j = 0; j < employees.length; j++)
		{
			System.out.printf("%n%s", employees[j]);
		}	
	} // end main
} // end class EmployeeTest
