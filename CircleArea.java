//CircleArea.java
//AB 01/26/2026
//Project for CIT-63

import  java.util.Scanner;
public class CircleArea {
    static void main(String[] args) {
        System.out.println("\n\n*******Welcome to Circle Area Calculator*****\n\n");

        //Create a new scanner object for user input
        Scanner scanner = new Scanner(System.in);


        //Prompt User for Radius of circle
        System.out.println("\nEnter the radius of the circle: ");

        //Get user input into our variable
        double radius = scanner.nextDouble();

        //Perform equation to find Cirle Area
        double area = Math.PI * (radius * radius);

        //Prove that the input was used to find the area
        System.out.println("The area of the circle with the radius: " + radius +", is: " + area + " sq");


    }
}
