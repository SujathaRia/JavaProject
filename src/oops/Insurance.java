package oops;

public class Insurance extends Citizen {
	
	public int InsuranceID;
	
	public Insurance() {
		super();
		System.out.println("Inside default cnstructor of Insurance");
	}
	
	public void Print() {
		super.Print();
		System.out.println("Insurance ID is " + InsuranceID);
		
	}
	
	public void Print(String message) {
		
		System.out.println("Typing some message " + message);
	}

}
