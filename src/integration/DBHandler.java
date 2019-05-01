package integration;

import util.CustomerIdentification;
import util.ItemIdentifier;
import util.Discount;
import data.Data;

/**
 * DBHandler manages the database, thus here is no database in this program.
 * Calls to the database stop in the integration layer.
 */
public class DBHandler {
    private Data data;
    private SaleDTO saleDTO;
    private ExternalAccountingSystem extAccSys;
    private InventorySystem invSys;

    public DBHandler(SaleDTO saleDTO){
        this.saleDTO = saleDTO;
        data = new Data();
        extAccSys = new ExternalAccountingSystem();
        invSys = new InventorySystem();
    }

    public ItemDTO getItemInformation(ItemIdentifier itemIdentifier){
        //Calls to the database stop in the integration layer. Here we would normally have a call to the class Data.
        ItemDTO itemDTO = data.getItemInformationData(itemIdentifier);
        return itemDTO;
    }

    public Discount getCustomerDiscount(CustomerIdentification customerIdentification){
        //Calls to the database stop in the integration layer. Here we would normally have a call to the class Data.
        Discount discount = new Discount(customerIdentification);
        return discount;
    }

    public void updateSystems(SaleDTO saleDTO){
        extAccSys.updateExternalAccountingSystem(saleDTO);
        invSys.updateInventorySystem(saleDTO);
    }
}
