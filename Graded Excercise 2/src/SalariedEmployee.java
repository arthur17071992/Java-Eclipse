
public class SalariedEmployee extends Employee{
	private double annualSalary;
	
	// constructor
	public SalariedEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double annualSalary)
	{
		super(firstName, lastName, socialSecurityNumber);
		
		if(annualSalary < 40000.00 || annualSalary > 70000.00)
			throw new IllegalArgumentException(
					"Annual Salary must be < 40,000 or > 50,000");
		
		this.annualSalary = annualSalary;
	}
	
	// set annual salary
	public void setAnnualSalary(double annualSalary)
	{
		if(annualSalary < 40000.00 || annualSalary > 50000.00)
			throw new IllegalArgumentException(
					"Annual Salary must be < 40,000 or > 50,000");
		
		this.annualSalary = annualSalary;
	}
	
	// return annual salary
	public double getAnnualSalary()
	{
		return annualSalary;
	}
	
	// return String representation of SalariedEmployee object
	@Override
	public double earnings()
	{
		return getAnnualSalary();
	}
	
	@Override
	public String toString()
	{
		return String.format("%n%s %s%n%s: %.2f", "salaried",
				super.toString(), "annual salary", getAnnualSalary());
	} // end toString method	
} // end class SalariedEmployee
