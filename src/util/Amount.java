package util;

/**
 * An object modelling any amount.
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
     * Gets the amount from the Amount.
     *
     * @return The amount of the instance.
     */
    public double getAmount(){
        return this.amount;
    }

    /**
     * Used to add one amount with another.
     *
     * @param amount Takes an amount to add with.
     * @return The sum of the added values.
     */
    public void add(Amount amount){
        this.amount = this.amount + amount.getAmount();
    }

    /**
     * Used to subtract one amount with another.
     *
     * @param amount The amount to subtract with.
     * @return The difference of the subtracted values.
     */
    public Amount subtract(Amount amount){
        return new Amount(this.amount - amount.getAmount());
    }

    /**
     * Used to multiply one amount with another.
     *
     * @param amount The amount to multiply with.
     * @return The product of the multiplied values.
     */
    public Amount multiply(Amount amount){
        return new Amount(this.amount * amount.getAmount());
    }

    /**
     * SUT: Used to test if the Amounts are equal.
     *
     * @param otherObj The object of any object type.
     * @return Returns <code>true</code> if equal. Returns <code>false</code> if not equal.
     */
    public boolean equals(Object otherObj){
        if(otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        Amount otherCasted = (Amount) otherObj;
        if (!(this.amount == otherCasted.amount)) return false;
        return true;
    }

    /**
     * Converts the instance of Amount to String.
     *
     * @return Amount as String.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getAmount());
        return builder.toString();
    }
}