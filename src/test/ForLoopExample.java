package test;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int num = 1; num <= 10; num++) {
			System.out.println(num);
		}

		System.out.println("End of for loop");

		for (int num1 = 10; num1 >= 1; num1 -= 2) {
			System.out.println(num1);
		}

		System.out.println("End of second for loop");

		int num = 2;
		for (int i = 1; i < 11; i++) {

			System.out.println(num * i);
			System.out.printf("%d * %d = %d \n", num, i, num*i);
		}

		System.out.println("End of Table 2");

		int[] arr1 = { 2, 3, 4, 6, 8, 9 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Element value is : " + arr1[i]);
		}
		
		//for each loop
		
		for(int val:arr1) {
			System.out.println("value is " +val);
		}
		
		
		String str1 = "John";
		for(int i=0;i<str1.length();i++) {
			
			System.out.println("Character value is : " +str1.charAt(i));
			
		}
		
	}
	
	
}
