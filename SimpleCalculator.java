//SimpleCalculator.java
//AB 1/26/2026
//Project for class CIT-63

import  java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("\n\n*******Welcome to Java Simple Calculator*******\n\n");

        //Create scanner object to capture User Input
        Scanner scanner=new Scanner(System.in);

        //Capture User input of two numbers
        System.out.println("\nInput first number:");
        double num1=scanner.nextDouble();

        System.out.println("\nInput second number:");
        double num2=scanner.nextDouble();

        //establish possible equations
        double sum=num1+num2;
        double difference=num1-num2;
        double product = num1*num2;
        double division=num1/num2;

        //provide results to user
        System.out.println("\nResults:\n");
        System.out.println(num1+ "+" + num2+ "="+sum);
        System.out.println(num1+"-"+num2+"="+difference);
        System.out.println(num1+"*"+num2+"="+product);
        System.out.println(num1+"/"+num2+"="+division);
    }
}
