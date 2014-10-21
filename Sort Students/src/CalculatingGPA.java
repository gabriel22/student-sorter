
public class CalculatingGPA {
	private String firstName;
	private String lastName;
	private String classPeriod1;
	private double grade1;
	private String classPeriod2;
	private double grade2;
	private String classPeriod3;
	private double grade3;
	private double GPA;
	
	public CalculatingGPA(String fn, String ln, String c1, double g1, String c2, double g2, String c3, double g3, double Gpa)
	{
		  firstName = fn;
		  lastName = ln;
		  classPeriod1 = c1;
		  grade1 = g1;
		  classPeriod2 = c2;
		  grade2 = g2;
		  classPeriod3 = c3;
		  grade3 = g3;
		  GPA = Gpa;
	}
	
	public String getfirstName()
	{
	return firstName;
	}
	
	public String getlastName()
	{
	return lastName;
	}
	
	public String classPeriod1()
	{
	return classPeriod1;
	}
	
	public double grade1()
	{
	return grade1;
	}
	
	public String classPeriod2()
	{
	return classPeriod1;
	}
	
	public double grade2()
	{
	return grade1;
	}
	
	public String classPeriod3()
	{
	return classPeriod3;
	}
	
	public double grade3()
	{
	return grade3;
	}
	
	public double GPA()
	{
	return GPA;
	}
	
	
	
}
