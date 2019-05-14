package model;

import integration.ItemDTO;
import util.Amount;

/**
 * Holds the pair of item and quantity, which can be viewed as the item line on receipt.
 */
public class ItemOnSale {
    private ItemDTO itemDTO;
    private int quantity;

    /**
     * Creates a new instance.
     *
     * @param itemDTO The item to be stored.
     * @param quantity The quantity of that item to be stored.
     */
    public ItemOnSale(ItemDTO itemDTO, int quantity){
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }

    /**
     * Gets the ItemDTO from the ItemOnSale.
     *
     * @return The ItemOnSale ItemDTO.
     */
    public ItemDTO getItemDTO(){
        return this.itemDTO;
    }

    /**
     * Gets the quantity from the ItemOnSale.
     *
     * @return The ItemOnSale quantity.
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Gets the price from the ItemOnSale.
     *
     * @return The ItemOnSale price.
     */
    public Amount getItemPrice(){
        return this.itemDTO.getItemDTOPrice();
    }

    /**
     * Increments the quantity.
     *
     * @param quantity The number to increment the quantity with.
     */
    public void incrementQuantity(int quantity){
        this.quantity += quantity;
    }

    /**
     * Converts the instance of ItemOnSale to String.
     *
     * @return Instance of ItemOnSale as String.
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(itemDTO.getItemDTODescription() + "\t\t");
        builder.append(quantity + " st * ");
        builder.append(itemDTO.getItemDTOPrice() + "kr ");
        builder.append("\t\t" + itemDTO.getItemDTOPrice().getAmount()*quantity + " kr ");
        builder.append(System.getProperty("line.separator"));
        return builder.toString();
    }
}
