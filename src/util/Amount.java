package util;

/**
 *
 */
public class Amount {
    private double amount;

    /**
     * Creates a new instance.
     *
     * @param amount Takes parameter and stores it in the object.
     */
    public Amount(double amount){
        this.amount = amount;
    }

    /**
     * Get method for Amount.
     * @return Returns the amount of the instance.
     */
    public double getAmount(){
        return this.amount;
    }

    /**
     * Used to subtract one amount with another.
     *
     * @param amount Takes an amount to subtract with.
     * @return Returns the difference between the amount instance and the parameter.
     */
    public Amount subtract(Amount amount){
        return (new Amount(this.amount - amount.getAmount()));
    }
}