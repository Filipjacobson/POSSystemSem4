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
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(itemDTO.getDescription() + "\t\t");
        builder.append(quantity + " st * ");
        builder.append(itemDTO.getItemDTOPrice() + "kr ");
        builder.append("\t\t" + itemDTO.getItemDTOPrice().getAmount()*quantity + " kr ");
        builder.append(System.getProperty("line.separator"));
        return builder.toString();
    }
}
