public class VarsAndMath {
    static void main(String[] args) {
        //1.Primitive-type variables
        int quantity=5;
        double pricePerItem=25.25;
        double taxRate=0.095;

        //2.Simple arithmetic
        double subtotal = quantity * pricePerItem;
        double taxAmount =  subtotal*taxRate;
        double finalTotal = subtotal + taxAmount;

        //3. String concatenation
        // We use the '+' operator to join text and operations together
        System.out.println("Item quantity: " + quantity);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("The final price is: $" + finalTotal);
    }
}
