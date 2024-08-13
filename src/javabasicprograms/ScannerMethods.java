package javabasicprograms;

import java.util.Scanner;

public class ScannerMethods {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double doub = s.nextDouble();
        System.out.println("You entered double: " + doub);
        
        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = s.nextBoolean();
        System.out.println("You entered boolean: " + bool);

        System.out.print("Enter any value: ");
        if (s.hasNext()) {
        	String any = s.next();
        	System.out.println("You entered: " + any);
		        }
           

        System.out.print("Enter an integer value: ");
		if (s.hasNextInt()) {
			int value = s.nextInt();
			System.out.println("You entered integer: " + value);
		        }
		
		System.out.print("Enter a line of text: ");
		s.nextLine();
		if (s.hasNextLine()) {
			String line = s.nextLine();
			System.out.println("You entered a line: " + line);
		        }
		s.close();
		}
}
