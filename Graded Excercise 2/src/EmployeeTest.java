
public class EmployeeTest {
	public static void main(String[] args)
	{
		// create five element Employee array
		CommissionEmployee[] employees = new CommissionEmployee[7];
		Employee[] employee = new Employee[3];
		// instantiate CommissionEmployee object
		employees[0] = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000.00, 0.06);
		employees[1] = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "333-33-3333", 10000.00, 0.06, 300.00);
		employee[0] = new SalariedEmployee(
				"Ted", "Roosevelt", "444-44-4444", 45000.00);
		employees[2] = new BasePlusCommissionEmployee(
				"Mary", "Sanchez", "123-45-6789", 6500.00, 0.05, 250.00);
		employees[3] = new CommissionEmployee(
				"Pat", "Marquet", "555-55-5555", 8000.00, 0.05);
		employees[4] = new CommissionEmployee(
				"Mike", "Jackson", "987-65-4321", 11000.00, 0.07);
		employee[1] = new SalariedEmployee(
				"Fred", "Jordan", "555-44-5555", 55000.00);
		employee[2] = new SalariedEmployee(
				"Ned", "Flanders", "666-66-6666", 66000.00);
		employees[5] = new CommissionEmployee(
				"Drew", "Smith", "111-22-1111", 5000.00, 0.05);
		employees[6] = new BasePlusCommissionEmployee(
				"Barry", "Barnes", "321-54-9876", 7500.00, 0.04, 320.00);
		
		// get data of each object in employees array
		for(int j = 0; j < employees.length; j++)
		{
			System.out.printf("%n%s", employees[j]);
		}
		
		for(int i = 0; i < employee.length; i++)
		{
			System.out.printf("%n%s", employee[i]);
		}
	} // end main
} // end class EmployeeTest
