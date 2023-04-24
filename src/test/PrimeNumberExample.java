package test;

public class PrimeNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 14;
		
		boolean flag = true;
		
		
		for(int i=2; i<number-1; i++) {
		
		int rem = number%i;
		
		if(rem==0) {
			
			flag = false;
			break;
						
		}
		}
		if(flag == true) {
			System.out.println("num is prime");
					
		}
		else
		{
			System.out.println("num is not prime");
		}
	}

}
