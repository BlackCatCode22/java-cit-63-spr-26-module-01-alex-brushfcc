//FavoriteNumber.java
//AB 01/26/2026
//Project for CIT-63

import java.util.Scanner;

public class FavoriteNumber {
    static void main(String[] args) {
        System.out.println("\n\n ******Welcome to Favorite Number*****\n\n");

        //Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //Create a string of variables to hold user's favorite number
        String favoritenumber;

        //Prompt user for favorite number
        System.out.println("\n Please enter your favorite number:");

        //Get the input into our variable
        favoritenumber = scanner.nextLine();

        //Prove that you got the favorite number
        System.out.println("\nHello, " + favoritenumber +" is an excellent favorite number!\n");
    }
}
