package view;

import controller.Controller;
import integration.SaleDTO;
import util.Amount;
import util.ItemIdentifier;

/**
 *
 */
public class View {
    private Controller contr;
    private Amount paidAmount;

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
        SaleDTO saleDTO = contr.startNewSale();

        saleDTO = contr.addItem(1234, 1);
        saleDTO = contr.addItem(2345, 1);
        saleDTO = contr.addItem(3456, 1);
        System.out.println(saleDTO);
        System.out.println(System.getProperty("line.separator"));

        Amount paidAmount = new Amount(1000);
        contr.pay();
   }
}

