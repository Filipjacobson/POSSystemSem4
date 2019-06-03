package controller;

import integration.*;
import model.*;
import util.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Controls and delegates the important tasks.
 */
public class Controller {
    private AccountingSystem accountingSystem;
    private DBHandler dbhandl;
    private InventorySystem inventorySystem;
    private Printer printer;
    private Sale sale;
    private List<TotalRevenueObserver> trolist;

    /**
     * Creates a new instance.
     *
     * @param systemCreator Holds the created instances of the external systems.
     */
    public Controller(SystemCreator systemCreator){
        this.accountingSystem = systemCreator.getAccountingSystem();
        this.inventorySystem = systemCreator.getInventorySystem();
        this.printer = systemCreator.getPrinter();
        this.dbhandl = new DBHandler(accountingSystem, inventorySystem);
        this.trolist = new ArrayList<>();
    }

    /**
     * View initiates a new sale by calling this method. A new instance is created.
     */
    public void startNewSale(){
        sale = new Sale();
    }

    /**
     * Adds an item to the sale.
     *
     * @param itemIdentifier The item identifier of the item entered.
     * @param quantity Number of items entered.
     * @return The SaleDTO containing the whole sale.
     */
    public SaleDTO addItem(int itemIdentifier, int quantity) throws OperationFailureException{
        try{
            ItemDTO foundItem = dbhandl.getItemInformation(new ItemIdentifier(itemIdentifier));
            if (foundItem != null){
                sale.addItem(new ItemOnSale(foundItem, quantity));
                return new SaleDTO(sale);
            } else {
                return null;
            }
        }
        catch (OperationFailureException e){
            throw new OperationFailureException(e.getMessage());
        }
    }

    /**
     * Manages the payment process.
     *
     * @param paidAmount Takes the amount paid to apply to the sale.
     */
    public void pay(Amount paidAmount){
        Payment payment = new Payment(paidAmount);
        sale.addPayment(payment);
        SaleDTO saleDTO = new SaleDTO(sale);
        updateSystems(saleDTO);
        notifyObservers(payment);
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

    /**
     *
     * @param payment
     */
    private void notifyObservers(Payment payment){
        for(TotalRevenueObserver observer : trolist){
            observer.newTotal(payment.getTotal());
        }
    }

    public void addTotalRevenueObserver(TotalRevenueObserver totalRevenueObserver){
        trolist.add(totalRevenueObserver);
    }
}
