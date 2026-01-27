//SimpleInterest.java
//AB 01/26/2026
//Project for class CIT-63

import java.util.Scanner;

public class SimpleInterest {
    static void main() {
        System.out.println("\n\n*****Welcome to Interest Calculator*****\n\n");

        //Set up new scanner object to capture inputs
        Scanner scanner = new Scanner(System.in);

        //Collect inputs from user for inputs
        System.out.println("\nEnter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("\nEnter the annual interest rate (e.g. 5 or 5%):");
        double rate = scanner.nextDouble();

        System.out.println("\nEnter the time (In years):");
        double time = scanner.nextDouble();

        //Insert user inputs into equation
        double interest = principal * (rate / 100) * time;

        //Provide the user with the result
        System.out.println("\n******Your Results******");
        System.out.printf("\nYour total interest after, " +time + " years is: $%.2f%n", interest);

    }
}
