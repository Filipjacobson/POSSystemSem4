package util;

/**
 *
 */
public class Amount {
    private double amount;

    /**
     *
     * @param amount
     */
    public Amount(double amount){
        this.amount = amount;
    }

    /**
     *
     * @return
     */
    public double getAmount(){
        return this.amount;
    }

    /**
     *
     * @param amount
     * @return
     */
    public Amount subtract(Amount amount){
        Amount returnAmount = new Amount(this.amount - amount.getAmount());
        return returnAmount;
    }
}
