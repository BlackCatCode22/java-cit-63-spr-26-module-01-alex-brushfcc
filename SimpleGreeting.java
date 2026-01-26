//SimpleGreeting.java
//AB 1/26/2026
//project for CIT-63 class

import java.util.Scanner;

public class SimpleGreeting {
    public static void main(String[] args) {
        System.out.println("\n\n***** Welcome to Simple Greeting ***\n\n");

        //Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a strin of variables to hold our user's name
        String myUserName;

        //Prompt user for their name
        System.out.print("\n Please enter your name: ");

        //Get the input into our variable
        myUserName = scanner.nextLine();

        //Prove that you got the username.
        System.out.println("\n Hello " + myUserName +"How are you?");
    }
}
