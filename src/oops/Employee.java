package oops;

public class Employee {
	
	public String Name;
	public int EmpId;
	private static int Salary = 50000;
	
	
	public Employee() {
		System.out.println("Inside default constructor");
	}
	
	public Employee(String var1, int var2) {
		
		System.out.println("Inside Parameterized constructor");
	
		this.Name = var1;
		this.EmpId = var2;
		
	}
	public void DisplayName() {
		
		System.out.println("Name of the employee is " + Name);
	}
	
	public static void DisplaySalary() {
		
		System.out.println("Salary of all Employees is " + Salary);
		
	}
	

}
