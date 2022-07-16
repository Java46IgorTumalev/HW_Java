package telran.people;

public class SalesEmployee extends Employee {

	public double Sales;
	public double persentPay;
	
	public double SalesSalary(double Sales, double persentPay) {
		
		return Sales / 100 * persentPay;
	}
	
	public SalesEmployee(String name, int BirthYear, long id, String email, double Sales, double persentPay) {
		super(name, BirthYear, id, email, 0);
		this.Sales = Sales;
		this.persentPay = persentPay;
		
	}
	
	
	
	@Override
	public String toString() {

		return "Sales Employee: Name - "+ name +"; Year - "+ BirthYear +"; ID - "+ id +"; Email - "+ email +"; Salary(Sales Employee) - Sales("+ Sales +") * persent to pay("+ persentPay + ") = "+ SalesSalary(Sales, persentPay)+"";
	}
	

}
