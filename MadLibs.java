//MadLibs.java
//AB 01/26/2026
//Project for class CIT-63

import java.util.Scanner;

public class MadLibs {
    static void main() {
        System.out.println("\n\n**********Welcome to My MadLib**********\n\n");

        //Create a new Scanner object to capture user input
        Scanner scanner = new Scanner(System.in);

        //Gather user input of nouns,verbs,adjectives etc to insert in story
        System.out.println("\nEnter a name:");
        String name = scanner.nextLine();

        System.out.println("\nEnter a verb:");
        String verb = scanner.nextLine();

        System.out.println("\nEnter an adjective:");
        String adjective = scanner.nextLine();

        System.out.println("\nEnter an animal:");
        String animal = scanner.nextLine();

        System.out.println("\n Enter an adverb:");
        String adverb = scanner.nextLine();

        //Put the story together
        String story= "\nOne day, " + name + ",was " + verb + " a(n) " + adjective+ " " + animal + " " +adverb +" through the woods to visit their mom.";

        //Output the storry to the user
        System.out.println(story);

    }
}
