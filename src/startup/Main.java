package startup;

import controller.Controller;
import integration.ExternalAccountingSystem;
import integration.InventorySystem;
import integration.Printer;
import view.View;
import integration.DBHandler;

public class Main {
    /**
     * Starts the application.
     *
     * @param args The application does not take any command line parameters.
     */
    public static void main (String[]args){
        Controller contr = new Controller();
        View view = new View(contr);
        Printer printer = new Printer();
        ExternalAccountingSystem eas = new ExternalAccountingSystem();
        InventorySystem is = new InventorySystem();
        view.runFakeSale();
    }
}

