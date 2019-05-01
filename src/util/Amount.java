package util;

public class Amount {
    private double amount;

    public Amount(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }

    public Amount subtract(Amount amount){
        Amount returnAmount = new Amount(this.amount - amount.getAmount());
        return returnAmount;
    }
}
