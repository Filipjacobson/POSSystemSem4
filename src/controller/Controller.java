package controller;

import integration.*;
import model.Sale;
import model.ItemOnSale;
import util.ItemIdentifier;

/**
 *
 */
public class Controller {
    private Sale sale;
    private DBHandler dbhandl;
    private SaleDTO saleDTO;
    private SystemCreator systemCreator;

    /**
     * Creates a new instance.
     *
     */
    public Controller(SystemCreator systemCreator){
        this.systemCreator = systemCreator;



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
    public ItemDTO addItem(ItemIdentifier itemIdentifier, int quantity){
        ItemDTO foundItem = dbhandl.getItemInformation(itemIdentifier);
        if (foundItem != null){
            sale.addItem(new ItemOnSale(foundItem, quantity));
            return foundItem;
        } else {
            return null;
        }
    }

    /**
     *
     */
    public void updateSystems(){
        dbhandl.updateSystems(saleDTO);
    }
}
