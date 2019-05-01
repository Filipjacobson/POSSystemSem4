package view;

import controller.Controller;
import util.Amount;

/**
 *
 */
public class View {
    private Controller contr;
    private Amount change;
    private Amount paidAmount;

    /**
     * Creates a new instance.
     *
     * @param contr The controller that is used for all operations.
     */
    public View (Controller contr){
        this.change = new Amount(10);
        this.contr = contr;
    }

    /**
     *
     */
    public void runFakeSale(){
        contr.startNewSale();
        this.change = contr.pay(paidAmount);
        System.out.println("Started new sale");
   }
}

