package model;

import integration.ItemDTO;
import util.ItemIdentifier;

public class ItemOnSale {
    private ItemDTO itemDTO;
    private int quantity;

    public ItemOnSale(ItemDTO itemDTO, int quantity){
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }

    public ItemDTO getItemDTO(){
        return this.itemDTO;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getItemPrice(){
        return itemDTO.getItemDTOPrice();
    }

    public void addQuantity(int quantity){
        this.quantity =+ quantity;
    }



    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append(itemDTO.toString());
        builder.append("\n");

        builder.append("Quantity: ");
        builder.append(quantity);

        return builder.toString();
    }
}
