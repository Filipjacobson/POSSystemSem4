package model;

import util.Amount;

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
     * @return
     */
    public double getPaidAmount(){
        return this.paidAmount.getAmount();
    }

    /**
     *
     * @return
     */
    public double getChange(){
        return this.paidAmount.subtract(this.total).getAmount();
    }

    /**
     *
     * @param total
     */
    public void calculateTotal(Amount total){
        this.total = total;
    }
}
