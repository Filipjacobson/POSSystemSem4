package startup;

import controller.Controller;
import integration.*;
import view.View;

/**
 *
 */
public class Main {
    /**
     * Starts the application.
     *
     * @param args The application does not take any command line parameters.
     */
    public static void main (String[]args){
        SystemCreator systemCreator = new SystemCreator();
        Controller contr = new Controller(systemCreator);
        View view = new View(contr);
        view.runFakeSale();
    }

}

