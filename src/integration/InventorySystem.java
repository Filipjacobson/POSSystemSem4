package integration;

import util.Amount;
import util.ItemIdentifier;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the accounting system, thus here is no accounting system in this program.
 * For the sake of testing the addItem()-method we will add fake items to the inventory.
 */
public class InventorySystem {
    private List<ItemDTO> inventoryList = new ArrayList<>();
    private final int GROCERY_VAT_RATE = 12;
    private final int TOBACCO_VAT_RATE = 50;

    /**
     * Creates a new instance.
     */
    public InventorySystem (){
        addFakeItems();
    }


    /**
     * Searches the list of all items in inventory.
     *
     * @param itemIdentifier Used to fetch the correct ItemDTO.
     * @return An ItemDTO which matched the requested itemIdentifier.
     */
    public ItemDTO getItemFromInventory(ItemIdentifier itemIdentifier) throws NoSuchItemIdentifierException{
        if (itemIdentifier == null){
            throw new NoSuchItemIdentifierException("There was no item with this ItemIdentifier");
        }

        for(ItemDTO itemDTO : inventoryList){
            if (itemIdentifier.equals(itemDTO.getItemDTOIdentifier())) {
                return itemDTO;
            }
        }
        return null;
    }

    private void addFakeItems(){
        inventoryList.add(new ItemDTO("Milk 1l                  ", new Amount(10), new ItemIdentifier(3456), GROCERY_VAT_RATE));
        inventoryList.add(new ItemDTO("Lemonade 33cl            ", new Amount(12), new ItemIdentifier(2345), GROCERY_VAT_RATE));
        inventoryList.add(new ItemDTO("John Silver w/o filter 3p", new Amount(39), new ItemIdentifier(1234), TOBACCO_VAT_RATE));
    }


    /**
     * Dummy class to update inventory system. Doesn't do anything.
     *
     * @param saleDTO
     */
    public void updateInventorySystem(SaleDTO saleDTO){ }
}
