package controller;

import integration.DBHandler;
import integration.SaleDTO;
import model.Sale;
import model.ItemOnSale;
import util.CustomerIdentification;
import util.ItemIdentifier;
import util.Amount;
import util.Discount;

/**
 *
 */
public class Controller {
    private Sale sale;
    private DBHandler dbhandl;
    private SaleDTO saleDTO;

    /**
     * Creates a new instance.
     *
     */
    public Controller(){
        dbhandl = new DBHandler(saleDTO);
    }

    /**
     *
     */
    public void startNewSale(){
        sale = new Sale();
    }

    /**
     *
     * @param itemIdentifier
     * @param quantity
     * @return
     */
    public SaleDTO addItem(ItemIdentifier itemIdentifier, int quantity){
        return sale.addItem(new ItemOnSale(dbhandl.getItemInformation(itemIdentifier), quantity));
    }

    /**
     *
     * @param customerIdentification
     */
    public void discountRequest(CustomerIdentification customerIdentification){
        sale.applyDiscount(dbhandl.getCustomerDiscount(customerIdentification));
    }

    /**
     *
     * @param paidAmount
     * @return
     */
    public Amount pay(Amount paidAmount){
        return sale.pay(paidAmount);
    }

    /**
     *
     */
    public void updateSystems(){
        dbhandl.updateSystems(saleDTO);
    }
}
