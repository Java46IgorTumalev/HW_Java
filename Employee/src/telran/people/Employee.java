package telran.people;

public class Employee extends Person  {

	public double basicSlary;
	
	public Employee(String name, int BirthYear, long id, String email, double basicSlary) {
		super(name, BirthYear, id, email);
		this.basicSlary = basicSlary;
		
	}
	
	
	
	@Override
	public String toString() {

		return "Basic Salary Employee: Name - "+ name +"; Year - "+ BirthYear +"; ID - "+ id +"; Email - "+ email +"; Salary(Basic Employee) - "+ basicSlary+"";
	}

	
	
	
}
