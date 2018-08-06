//employee class
public class Employee {

	private int id;
	private String name;
	private double monthlyBasic;
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	private float ptax;
	
	
	public Employee(int id, String name, double monthlyBasic) {
		this.id = id;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}

	public float getPtax() {
		return ptax;
	}

	public void setPtax(float ptax) {
		this.ptax = ptax;
	}
	
	//calculates annual basic
	double getAnnualBasic()
	{
		return monthlyBasic*12;
	}
	
	//calculates gross sallary
	double getMonthlyGrossSalary()
	{
		return monthlyBasic + 0.50*monthlyBasic + 1250.0 + 800.0;
	}
	
	//calculates deductions monthly
	double getMonthlyDeductions()
	{
		double esic=(monthlyBasic<= 5000.00)?(monthlyBasic*0.0475):0.0;
		double ptax=(getMonthlyGrossSalary()<=10000.00)?50.00:100.00;
		double pf=(0.1*monthlyBasic<6500.00)?0.1*monthlyBasic:6500.00;
		
		return esic+ptax+pf;
	}
	
	double getMonthlyTakeHome()
	{
		return (getMonthlyGrossSalary()-getMonthlyDeductions());
	}
	
	double getAnnualTakeHome()
	{
		return (12.0*getMonthlyTakeHome());
	}
	
}
