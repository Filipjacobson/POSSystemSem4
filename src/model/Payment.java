package model;

import util.Amount;
import integration.SaleDTO;
import integration.Printer;

/**
 *
 */
public class Payment {
    private Amount total;
    private Amount paidAmount;

    /**
     * Creates a new instance.
     *
     * @param paidAmount The amount customer paid for the sale.
     */
    public Payment(Amount paidAmount){
        this.paidAmount = paidAmount;
    }



    /**
     *
     * @param paidAmount
     * @return
     */
    /*
    public Amount pay(Amount paidAmount){
        this.paidAmount = paidAmount;
        total.subtract(paidAmount); // add guard so that this valuue does not become negative.

        return change;
    }
    */

    public Amount getTotal(){
        return this.total;
    }

    public Amount getPaidAmount(){
        return this.paidAmount;
    }


}
