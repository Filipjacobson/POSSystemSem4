package model;

import integration.ItemDTO;
import util.Amount;

/**
 *
 */
public class ItemOnSale {
    private ItemDTO itemDTO;
    private int quantity;

    /**
     * Creates a new instance.
     *
     * @param itemDTO
     * @param quantity
     */
    public ItemOnSale(ItemDTO itemDTO, int quantity){
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }

    /**
     * Gets the ItemDTO from the ItemOnSale.
     *
     * @return
     */
    public ItemDTO getItemDTO(){
        return this.itemDTO;
    }

    /**
     * Gets the quantity from the ItemOnSale.
     *
     * @return
     */
    public int getQuantity(){
        return this.quantity;
    }

    /**
     * Gets the price from the ItemOnSale.
     *
     * @return
     */
    public Amount getItemPrice(){
        return this.itemDTO.getItemDTOPrice();
    }

    /**
     *
     */
    public void incrementQuantity(int number){
        this.quantity += number;
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
