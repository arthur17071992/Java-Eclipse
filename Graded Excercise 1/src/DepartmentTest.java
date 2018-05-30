
public class DepartmentTest {
	public static void main(String[] args)
	{
		// instantiate CommissionEmployee object
		CommissionEmployee employee = new CommissionEmployee(
				"Sue", "Jones", "222-22-2222", 10000.00, 0.06);
		CommissionEmployee employee02 = new CommissionEmployee(
				"Ted", "Jones", "222-12-1234", 11000.00, 0.07);
		CommissionEmployee employee03 = new CommissionEmployee(
				"Veronica", "Jones", "222-23-4567", 12000.00, 0.08);
		CommissionEmployee employee04 = new CommissionEmployee(
				"Zed", "Jones", "222-34-5678", 13000.00, 0.09);
		
		// instantiate BasePlusCommissionEmployee object
		BasePlusCommissionEmployee employee05 = new BasePlusCommissionEmployee(
				"Bob", "Lewis", "333-33-3333", 5000.00, 0.04, 300.00);
		BasePlusCommissionEmployee employee06 = new BasePlusCommissionEmployee(
				"Carl", "Lewis", "333-11-1111", 6000.00, 0.05, 310.00);
		BasePlusCommissionEmployee employee07 = new BasePlusCommissionEmployee(
				"Denise", "Lewis", "333-22-2222", 7000.00, 0.06, 320.00);
		BasePlusCommissionEmployee employee08 = new BasePlusCommissionEmployee(
				"Edna", "Lewis", "333-22-4324", 8000.00, 0.07, 330.00);
		
		// instantiate Department object
		Department department1 = new Department("Online Sales", "B22");
		Department department2 = new Department("Brick and Mortar Sales", "A313");
		
		// print output department Online Sales
		System.out.printf(department1.toString());
		System.out.printf(employee.toString());
		System.out.printf(employee02.toString());
		System.out.printf(employee05.toString());
		System.out.printf(employee06.toString());
		
		// print output department Brick & Mortar Sales
		System.out.printf(department2.toString());
		System.out.printf(employee03.toString());
		System.out.printf(employee04.toString());
		System.out.printf(employee07.toString());
		System.out.printf(employee08.toString());
	} // end main
} // end class DepartmentTest
