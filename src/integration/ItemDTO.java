package integration;

import util.ItemIdentifier;

/**
 * Contains information about one particular item.
 */

public final class ItemDTO {
    private final String description;
    private final double price;
    private final ItemIdentifier identifier;
    private final double VATrate;


    public ItemDTO(String description, int price, ItemIdentifier identifier, double VATrate){
        this.price = price;
        this.identifier = identifier;
        this.description = description;
        this.VATrate = VATrate;
    }

    public ItemDTO getItemDTO(){
        return this;
    }

    public double getItemDTOPrice(){
        return this.price;
    }
}
