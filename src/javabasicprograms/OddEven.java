package javabasicprograms;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num%2==0) {
        	System.out.println("The number is even");
        }
        else {
        	System.out.println("The number is odd");
        }
        sc.close();

	}

}
