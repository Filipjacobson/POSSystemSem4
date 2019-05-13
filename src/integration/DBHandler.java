package integration;

import util.ItemIdentifier;
import data.Data;

/**
 * DBHandler manages the database, thus here is no database in this program.
 * Calls to the database stop in the integration layer.
 */
public class DBHandler {
    private Data data;
    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;

    /**
     * Creates a new instance.
     */
    public DBHandler(){
        data = new Data();
        accountingSystem = new AccountingSystem();
        System.out.println("Creating InventorySystem in DBhandler constructor");
        inventorySystem = new InventorySystem();
    }

    /**
     * Calls to the database stop in the integration layer. However, we will for this task have a list
     * of the whole inventory available in the integration layer. The method finds the item asked for.
     *
     * @param itemIdentifier Used to fetch the correct ItemDTO.
     * @return An ItemDTO which matched the requested itemIdentifier.
     */
    public ItemDTO getItemInformation(ItemIdentifier itemIdentifier){
        return inventorySystem.getItemFromInventory(itemIdentifier);
    }

    /**
     *
     * @param saleDTO
     */
    public void updateSystems(SaleDTO saleDTO){
        accountingSystem.updateAccountingSystem(saleDTO);
        inventorySystem.updateInventorySystem(saleDTO);
    }
}
