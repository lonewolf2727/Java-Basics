package javabasicprograms;

import java.util.Scanner;

public class largestAmongThree {

	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int num1 = s.nextInt();
		        System.out.print("Enter second number: ");
		        int num2 = s.nextInt();
		        System.out.print("Enter third number: ");
		        int num3 = s.nextInt();

		        int largest;
		        if (num1 >= num2 && num1 >= num3) {
		            largest = num1;
		        } else if (num2 >= num1 && num2 >= num3) {
		            largest = num2;
		        } else {
		            largest = num3;
		        }

		        System.out.println("The largest number is: " + largest);
		        s.close();
		    }
	}

