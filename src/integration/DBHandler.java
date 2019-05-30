package integration;

import controller.OperationFailureException;
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
        inventorySystem = new InventorySystem();
    }

    /**
     * Calls to the database stop in the integration layer. However, we will for this task have a list
     * of the whole inventory available in the integration layer. The method finds the item asked for.
     *
     * @param itemIdentifier Used to fetch the correct ItemDTO.
     * @return An ItemDTO which matched the requested itemIdentifier.
     */
    public ItemDTO getItemInformation(ItemIdentifier itemIdentifier) throws OperationFailureException{
        try{
            return inventorySystem.getItemFromInventory(itemIdentifier);
        }
        catch(NoSuchItemIdentifierException | DatabaseConnectionFailureException e) {
            throw new OperationFailureException(e.getMessage());
        }
    }

    /**
     * Updating the external systems.
     *
     * @param saleDTO THe SaleDTO containing all the relevant information for the external systems.
     */
    public void updateSystems(SaleDTO saleDTO){
        accountingSystem.updateAccountingSystem(saleDTO);
        inventorySystem.updateInventorySystem(saleDTO);
    }
}
