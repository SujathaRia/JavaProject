package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Sujatha";
		String name1 = "Ria";
		
		System.out.println("Number of characters in first string is " +name.length());
		System.out.println("Number of characters in second string is " +name1.length());
		System.out.println("the third character in first string is " +name.charAt(3));
		System.out.println("the last character in first string is " +name.charAt(name.length()-1));
		System.out.println("The string in upercase is" +name.toUpperCase());
		System.out.println("The string in lower case is" +name.toLowerCase());
	}

}
