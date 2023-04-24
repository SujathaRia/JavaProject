package test;

public class ReversalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "raceCar";
		
		String result = "";
		
		
		for(int i= str1.length()-1;i>=0; i--) {		
			
			result = result + str1.charAt(i);
			
		}
		
		System.out.println("Reversed string is :" +result);
		
		if(str1.equalsIgnoreCase(result)) {
			
			System.out.println("the string is Palindrome");
		
		}
		else {
			
			System.out.println(" the string is not palindrome");
		}
		
		String str2= "David meets John and Lily";
		
		String[] arr = str2.split(" ");
				
		String result1= "";
		
		for(int i=arr.length-1;i>=0;i--) {
			
			result1 = result1+arr[i]+ " ";
			
		}
		System.out.println("The result is " +result1.trim());
	}

}
