package telran.people;

public class Person{ 
	
	public String name;
	public long id;
	public int BirthYear;
	public String email;
	

	public Person(String name, int BirthYear, long id,  String email) {
		this.name = name;
		this.BirthYear = BirthYear;
		this.id = id;
		this.email = email;
	}

	public String getEmail() {
		
		return email;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public int getBirthYear() {
		return BirthYear;
	}

//	String regex = "/^([A-Za-z0-9_\\.-]+)@([\\dA-Za-z\\.-]+)\\.([a-z\\.]{2,6})$/g";
//	
//	public boolean chekEmail(String email) {
//		if(email == regex) {
//		return true;
//		}
//		else {
//			return false;
//		}
//	}

//	public boolean EmailCheck = chekEmail(email);
	
	public String toString() {
		return "Person: " + "Name - " + name + ", Year - " + BirthYear + ", ID - " + id + ", Email: " + email + "";
		
	}
}



