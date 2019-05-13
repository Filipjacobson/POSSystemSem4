package util;

/**
 *
 */
public class Amount {
    private double amount;

    /**
     * Creates a new instance.
     *
     * @param amount Takes double and stores it in the object.
     */
    public Amount(double amount){
        this.amount = amount;
    }

    /**
     * Creates a new instance.
     *
     * @param amount Takes Amount and stores it in the object.
     */
    public Amount(Amount amount){
        this.amount = amount.getAmount();
    }

    /**
     * Get method for Amount.
     * @return Returns the amount of the instance.
     */
    public double getAmount(){
        return this.amount;
    }

    /**
     * Used to add one amount with another.
     *
     * @param amount Takes an amount to add with.
     * @return Returns the sum of the added values.
     */
    public void add(Amount amount){
        this.amount = this.amount + amount.getAmount();
    }

    /**
     * Used to subtract one amount with another.
     *
     * @param amount Takes an amount to subtract with.
     * @return Returns the difference of the subtracted values.
     */
    public Amount subtract(Amount amount){
        return new Amount(this.amount - amount.getAmount());
    }

    public Amount multiply(Amount amount){
        return new Amount(this.amount * amount.getAmount());
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getAmount());
        return builder.toString();
    }
}