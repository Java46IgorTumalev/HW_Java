package telran.people;

 public class WageEmployee extends Employee {
	
	 
	public double wage;
	public double hours;


	public double Salary(double wage, double hours) {

		return wage * hours;
	 }

	public WageEmployee(String name, int BirthYear, long id, String email, double wage, double hours) {
		super(name, BirthYear, id, email, 0);
		this.wage = wage;
		this.hours = hours;
		
		
	}
	
	@Override
	public String toString() {

		return "Employee: Name - "+ name +"; Year - "+ BirthYear +"; ID - "+ id +"; Email - "+ email +"; Salary(wage Employee) - wage("+ wage +") * hours("+ hours + ") = "+ Salary(wage, hours)+"";
	}

	 
 }
