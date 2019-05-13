package view;

import controller.Controller;
import integration.SaleDTO;
import util.Amount;

/**
 *
 */
public class View {
    private Controller contr;
    private SaleDTO saleDTO;

    /**
     * Creates a new instance.
     *
     * @param contr The controller that is used for all operations.
     */
    public View (Controller contr){
        this.contr = contr;
    }

    /**
     *
     */
    public void runFakeSale(){
        System.out.println("runFakeSale() has started in View");
        contr.startNewSale();

        saleDTO = contr.addItem(1234, 3);
        saleDTO = contr.addItem(1234, 2);
        saleDTO = contr.addItem(2345, 1);
        saleDTO = contr.addItem(3456, 1);
        System.out.println(saleDTO);
        System.out.println(System.getProperty("line.separator"));

        Amount paidAmount = new Amount(500);
        contr.pay(paidAmount);
   }
}

