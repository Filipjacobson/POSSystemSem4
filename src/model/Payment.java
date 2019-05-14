package model;

import util.Amount;

/**
 * An object modelling the payment.
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
     * Adds the total to the Payment.
     *
     * @param total The total.
     */
    public void addToTotal(Amount total){
        this.total = total;
    }

    /**
     * Gets the paid amount from the Payment.
     *
     * @return The paid amount.
     */
    public double getPaidAmount(){
        return this.paidAmount.getAmount();
    }

    /**
     * Calculates and gets the change from the Payment.
     *
     * @return The change (paid amount - total).
     */
    public double getChange(){
        return this.paidAmount.subtract(this.total).getAmount();
    }
}
