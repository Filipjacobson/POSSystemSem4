package integration;

import model.Receipt;

/**
 * An object modelling the printer.
 */
public class Printer {
    /**
     * Creates a new instance.
     */
    public Printer(){

    }

    /**
     * Used to print the receipt. Simulates the physical print by printing in console.
     *
     * @param receipt Contains relevant data for a receipt.
     */
    public void print(Receipt receipt){
        System.out.println(receipt);
    }
}
