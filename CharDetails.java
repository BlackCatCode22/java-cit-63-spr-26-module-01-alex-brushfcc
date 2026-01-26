//CharDetails.java
//AB 01/26/2026
//Project for class CIT-63

import  java.util.Scanner;

public class CharDetails {
    static void main() {
        System.out.println("\n\n********Welcome to Character Details*******\n\n");

        //Create scanner object to capture user input
        Scanner scanner=new Scanner(System.in);


        //prompt user for Character and capture it
        System.out.println("\nPlease enter a single character (can be alphabetical, numerical or special):");
        char userChar= scanner.next().charAt(0);

        //Unicode Value
        int unicodeValue= (int) userChar;

        // Type of character letter, digit or symbol
        String type;
        if (Character.isLetter(userChar)){
            type=" a letter";
        }else if (Character.isDigit(userChar)){
            type=" a digit";
        }else{
            type=" Special character";
        }

        //provide User with results
        System.out.println("\n\n*******Character details*******\n\n");
        System.out.println("Character: " + userChar);
        System.out.println("Unicode value: " + unicodeValue);
        System.out.println("Type: " + type);
    }
}
