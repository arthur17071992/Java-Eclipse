
public class Department{
	private String departmentName; // department name
	private String officeNumber; // office number
	
	// eight-argument constructor
	public Department(String departmentName, String officeNumber)
	{
		this.departmentName = departmentName;
		this.officeNumber = officeNumber;
	} // end constructor
	
	// return department name
	public String getDepartmentName()
	{
		return departmentName;
	}
	
	// return office number
		public String getOfficeNumber()
		{
			return officeNumber;
		}
	
	// return String representation of Department
	@Override
	public String toString()
	{
		return String.format("%n%n%s: %s, %s: %s", 
				"department name", getDepartmentName(),
				"office number", getOfficeNumber());
	} // end toString method
} // end class Department
