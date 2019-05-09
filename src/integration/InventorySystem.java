package integration;

import util.ItemIdentifier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class InventorySystem {
    private List<ItemDTO> inventoryList = new ArrayList<>();

    private final int GROCERY_VAT_RATE = 12;
    private final int TOBACCO_VAT_RATE = 25;

    /**
     * Creates a new instance.
     */
    public InventorySystem (){
        addFakeItems();
    }

    public ItemDTO getItemFromInventory(ItemIdentifier itemIdentifier){
        for(ItemDTO itemDTO : inventoryList)
            if (itemIdentifier == itemDTO.getItemDTOIdentifier()) {
                return itemDTO;
            }
        return null;
    }

    private void addFakeItems(){
        inventoryList.add(new ItemDTO("Milk 1l", 10, new ItemIdentifier(3456), GROCERY_VAT_RATE));
        inventoryList.add(new ItemDTO("Lemonade 33cl", 12, new ItemIdentifier(2345), GROCERY_VAT_RATE));
        inventoryList.add(new ItemDTO("John Silver w/o filter 10p", 12, new ItemIdentifier(1234), TOBACCO_VAT_RATE));
    }


    /**
     *
     * @param saleDTO
     */
    public void updateInventorySystem(SaleDTO saleDTO){
        System.out.println("InventorySystem updated!");

        // to be fixed
    }
}
