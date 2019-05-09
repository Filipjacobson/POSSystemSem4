package integration;

import model.Receipt;

/**
 *
 */
public class Printer {
    /**
     * Creates a new instance.
     */
    public Printer(){

    }

    /**
     * Used to print the receipt. Simulates the physical print by printing in console.
     * @param receipt Contains relevant data for a receipt.
     */
    public static void print(Receipt receipt){
        System.out.println("THIS IS THE RECEIPT BEEING PRINTED: \n");
        receipt.toString();
    }
}
