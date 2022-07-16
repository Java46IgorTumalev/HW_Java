package src.telran.tests;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.people.WageEmployee;
import telran.people.Employee;
import telran.people.Person;
import telran.people.SalesEmployee;

class HWPersEmplTest {
	public double Salary(double wage, double hours) {
		return wage * hours;
	}
	
	
	

	@Test
	void PersonTest() {
		
		String name = "Vasyliy";
		int BirthYear = 1990;
		long id = 333444565;
		String email = "mail@gmail.com";
 
		
		String name1 = "Byba";
		int BirthYear1 = 1870;
		long id1 = 98765433;
		String email1 = "Kastorskiymailwrong.ba";
				
		Person person = new Person(name, BirthYear, id, email);
		System.out.println(person.toString());
		
		Person person1 = new Person(name1, BirthYear1, id1, email1);
		System.out.println(person1.toString());

	}
	
	@Test
	void BasicSalaryEmployeeTest() {
		String name = "Dima";
		int BirthYear = 1999;
		long id = 543298761;
		String email = "zhena@zhizni.net";
		double basicSlary = 5920.2;
		Employee Employee = new Employee(name, BirthYear, id, email, basicSlary);
		System.out.println(Employee.toString());

	}
	
	
	@Test
	void WageEmployeeTest() {
		String name = "Moshe";
		int BirthYear = 1970;
		long id = 87654321;
		String email = "Yahoo183@dot.com";
		double wage = 33.2;
		double hours = 200.2;
		

		
		WageEmployee wageEmployee = new WageEmployee(name, BirthYear, id, email, wage, hours);
		System.out.println(wageEmployee.toString());

		
	}
	
	@Test
	void SalesEmployeeTest() {
		String name = "Stive";
		int BirthYear = 1955;
		long id = 98761234;
		String email = "sales@apple.com";
		double Sales = 1234567;
		double persentPay = 7;
		
		SalesEmployee salesEmployee = new SalesEmployee(name, BirthYear, id, email, Sales, persentPay);
		System.out.println(salesEmployee.toString());
	}

}
