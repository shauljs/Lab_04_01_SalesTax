//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        // Declarations
        double purchasePrice;
        double salesTaxAmount;
        final double SALES_TAX_RATE = .05;

        //Prompt user for data entry
        System.out.println("Enter the purchase price: ");
        // Simulate user input
        System.out.println("50");
        purchasePrice = 50;

        // Calculate and display the sales tax amount

        salesTaxAmount = purchasePrice * SALES_TAX_RATE;
        System.out.println("The sales tax amount is " + salesTaxAmount + ".");
    }
}