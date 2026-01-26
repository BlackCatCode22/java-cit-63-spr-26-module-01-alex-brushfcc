//TempConverter.java
//AB 01/26/2026
//Project for CIT-63


public class TempConverter {
    static void main(String[] args) {
        System.out.println("\n\n********Welcome To Temperature Converter********");

        //set the variable of Farhenheit
        double Farhenheit= 98.6;

        // Convert Fahrenheit to Celcius
        double Celsius= (Farhenheit - 32) * (5.0/9.0);

        //output the conversion to celsius
        // %.2f means "format as a float with 2 decimal places"
        // %n is a platform-independent newline
        System.out.printf("Fahrenheit: %.1f°F%n", Farhenheit);
        System.out.printf("Celsius:    %.2f°C%n", Celsius);

    }
}
