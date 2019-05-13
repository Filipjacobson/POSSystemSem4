package controller;

import integration.*;
import model.*;
import util.*;

/**
 * Controls and delegades the important tasks.
 */
public class Controller {
    private AccountingSystem accountingSystem;
    private DBHandler dbhandl;
    private InventorySystem inventorySystem;
    private Printer printer;
    private Sale sale;


    /**
     * Creates a new instance.
     *
     */
    public Controller(SystemCreator systemCreator){
        this.accountingSystem = systemCreator.getAccountingSystem();
        this.dbhandl = new DBHandler();
        this.inventorySystem = systemCreator.getInventorySystem();
        this.printer = new Printer();
    }

    /**
     * View initiates a new sale by calling this method.
     *
     * @return An object
     */
    public void startNewSale(){
        sale = new Sale();
    }

    /**
     * Adds an item to the sale.
     *
     * @param itemIdentifier
     * @param quantity Number of items entered.
     * @return
     */
    public SaleDTO addItem(int itemIdentifier, int quantity){
        ItemDTO foundItem = dbhandl.getItemInformation(new ItemIdentifier(itemIdentifier));
        if (foundItem != null){
            sale.addItem(new ItemOnSale(foundItem, quantity));
            return new SaleDTO(sale);
        } else {
            return null;
        }
    }

    /**
     * Manages the payment process.
     *
     * @param paidAmount
     */
    public void pay(Amount paidAmount){
        Payment payment = new Payment(paidAmount);
        sale.addPayment(payment);
        SaleDTO saleDTO = new SaleDTO(sale);
        updateSystems(saleDTO);
        sale.printReceipt(printer);
    }

    /**
     * Updates the external systems. Called in the end of the sale.
     *
     * @param saleDTO Sending the object to the DBHandler to broadcast the object to necessary systems.
     */
    private void updateSystems(SaleDTO saleDTO){
        dbhandl.updateSystems(saleDTO);
    }
}
