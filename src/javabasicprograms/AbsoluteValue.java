package javabasicprograms;

import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        int absoluteValue = Math.abs(number);
		        System.out.println("The absolute value is: " + absoluteValue);
		        
		        scanner.close();
		  }

}

