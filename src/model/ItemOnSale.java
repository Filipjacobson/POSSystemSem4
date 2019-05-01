package model;

import integration.ItemDTO;
import util.ItemIdentifier;

/**
 *
 */
public class ItemOnSale {
    private ItemDTO itemDTO;
    private int quantity;

    /**
     *
     * @param itemDTO
     * @param quantity
     */
    public ItemOnSale(ItemDTO itemDTO, int quantity){
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }

    /**
     *
     * @return
     */
    public ItemDTO getItemDTO(){
        return this.itemDTO;
    }

    /**
     *
     * @return
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     *
     * @return
     */
    public double getItemPrice(){
        return itemDTO.getItemDTOPrice();
    }

    /**
     *
     * @param quantity
     */
    public void addQuantity(int quantity){
        this.quantity =+ quantity;
    }


    /**
     *
     * @return
     */
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append(itemDTO.toString());
        builder.append("\n");

        builder.append("Quantity: ");
        builder.append(quantity);

        return builder.toString();
    }
}
