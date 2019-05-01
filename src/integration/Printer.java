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
     *
     * @param receipt
     */
    public static void print(Receipt receipt){
        System.out.println("THIS IS THE RECEIPT BEEING PRINTED: \n");
        receipt.toString();
    }
}
