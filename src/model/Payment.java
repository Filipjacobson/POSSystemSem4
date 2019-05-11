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



    public double getTotal(){
        return this.total.getAmount();
    }

    public double getPaidAmount(){
        return this.paidAmount.getAmount();
    }

    public void calculateTotal(Amount total){

    }


}
