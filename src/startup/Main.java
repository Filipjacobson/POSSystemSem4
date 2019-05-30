package startup;

import controller.Controller;
import integration.*;
import view.ErrorMessageHandler;
import view.View;

/**
 * Main class starting the program.
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
        ErrorMessageHandler errorMessageHandler = new ErrorMessageHandler();
        View view = new View(contr, errorMessageHandler);
        view.runFakeSale();
    }
}

