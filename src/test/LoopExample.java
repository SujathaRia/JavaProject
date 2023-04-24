package test;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print numbers 1 to 10 using while loop
		
		int num = 1;
		
		while (num <=10){
			
			System.out.println(num);
			num++;
			
		}
		
		System.out.println("End of while loop");
		
		//print 10 to 1 using while loop
		int num1 = 10;
		
		while (num1 >=1) {
			
			if(num1 == 5) {
				System.out.println("Skip");
				num1--;
				continue;
			}	
			
			System.out.println(num1);
			num1--;
			
		}
		
		System.out.println("End of while loop");
		
	
		
	}

}
