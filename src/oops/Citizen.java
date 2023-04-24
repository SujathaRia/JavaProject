package oops;

public class Citizen extends Person {

	public int SSN;
	
	public Citizen() {
		
		super();
		System.out.println("Inside default constructor of citizen");
	}
	
	public Citizen(String Name, String CountryName, int Age, int SSN) {
		
		System.out.println("Inside Parameterized Constructor of Citizen");
		
		
		this.Name = Name;
		this.CountryName = CountryName;
		this.Age = Age;
		this.SSN = SSN;
		
	}
	
	public void Print() {
		System.out.println("SSN is " +SSN);
	}
}
