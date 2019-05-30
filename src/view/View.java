package view;

import controller.Controller;
import controller.OperationFailureException;
import integration.SaleDTO;
import util.Amount;

/**
 * View is in this program only presented as a simple class. Could in a real program be presented as a GUI.
 */
public class View {
    private Controller contr;
    private SaleDTO saleDTO;
    private ErrorMessageHandler errorMessageHandler;

    /**
     * Creates a new instance.
     *
     * @param contr The controller that is used for managing the overall work, delegating the important tasks.
     */
    public View (Controller contr, ErrorMessageHandler errorMessageHandler){
        this.contr = contr;
        this.errorMessageHandler = errorMessageHandler;
    }

    /**
     * Run a fake sale. Faking the scanning of multiple items.
     */
    public void runFakeSale(){
        try{
            contr.startNewSale();
            saleDTO = contr.addItem(2345, 20);
            saleDTO = contr.addItem(1234, 3);
            saleDTO = contr.addItem(1234, 2);
            saleDTO = contr.addItem(2345, 1);
            saleDTO = contr.addItem(3456, 5);
            System.out.println(saleDTO);
            System.out.println(System.getProperty("line.separator"));
            Amount paidAmount = new Amount(500);
            contr.pay(paidAmount);
        }
        catch(OperationFailureException e){
            errorMessageHandler.showUsrErrorMsg(e.getMessage());
            errorMessageHandler.logDevErrorMsg(e);
        }
   }
}

