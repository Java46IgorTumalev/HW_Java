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
//	 double Salary(double wage,double hours)
	 
 }

////import telran.people.calculation.calculation;
//
//
////		class Employee extends Person(String name, int BirthYear, long id,  String email) { 
////			super(name, BirthYear, id, email);
////			
////			
////		}
//
//
//public class Employee extends Person {
//private double Salary;
//
////	public double Salary;
//	
//	public Employee(String name, int BirthYear, long id,  String email, double wage, double hours) {
//		super(name, BirthYear, id,  email);
//		this.Salary = Salary(wage, hours);
//	}
////
////	public double  wage;
////	public double hours;
//	
//	public double Salary(double wage, double hours) {
//		return wage * hours;
//	}
//	
//	
//
//
////	public Double getwage() {
////		return this.getwage();
////	}
////	
////	public double getHours() {
////		return this.getHours();
////	}
////	
//	
////	public class calculation {
////		
////		public double Salary(double wage, double hours) {
////			return wage * hours;
////		}
////
////
//		public Double getwage() {
//			return this.getwage();
//		}
//		
//		public double getHours() {
//			return this.getHours();
//		}
//		
//		
//		
////	}
//
//
//
//
//	
//	
////	@Override
////	protected void setBirthYear(int BirthYear) {
////		setBirthYear(BirthYear);
////		
////	}
////	@Override
////	protected void setName(String name) {
////		setName(name);
////	}
////	@Override
////	protected void setId(long id) {
////		setId(id);
////	}
////	@Override
////	protected void setEmail(String email) {
////		setEmail(email);
////	}
//	
////	private void getPersonal() {
////		super.getName();
////		super.getBirthYear();
////		super.getId();
////		super.getEmail();
////		
////	}
//
//	
//	/*
//	 * @Override
//	public void setWidth(int width) {
//		setHeigthWidth(width);
//		
//	}
//@Override
//	public void setHeight(int height) {
//		setHeigthWidth(height);
//	}
//
//	private void setHeigthWidth(int length) {
//		super.setHeight(length);
//		super.setWidth(length);
//		
//	}
//	 */
//	
//	
//	
////	
//	@Override
//	public String toString() {
//		
//		String wage;
//		String hours;
//		Salary = Salary(wage, hours);
////		return "Employee: Name - " + name + ", Year - " + BirthYear + ", ID - " + id + ", Email: " + email + ", Salary is: wage("+ wage + ") * hours("+ hours +") = "Salary(wage, hours)+"";
////		return ", Salary is: wage("+ wage + ") * hours("+ hours+") = "Salary(wage, hours)+"";
//		return "Employee: Name - "+ name + ",Year - " + BirthYear + ", ID - " + id + ", Email: " + email + ", Salary is: wage(" + wage + ") * hours(" + hours +") = + Salary(wage, hours)";
//	}
//}
