package integration;

import util.Amount;
import util.ItemIdentifier;

/**
 * Contains information about one particular item.
 */
public final class ItemDTO {
    private final String description;
    private final Amount price;
    private final ItemIdentifier identifier;
    private final double VATrate;

    /**
     * Creates a new instance.
     *
     * @param description
     * @param price
     * @param identifier
     * @param VATrate
     */
    public ItemDTO(String description, Amount price, ItemIdentifier identifier, double VATrate){
        this.description = description;
        this.price = price;
        this.identifier = identifier;
        this.VATrate = VATrate;
    }

    /**
     *
     * @return
     */
    public ItemIdentifier getItemIdentifier() {
        return identifier;
    }

    /**
     *
     * @return
     */
    public Amount getItemDTOPrice(){
        return this.price;
    }

    /**
     *
     * @return
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Used to test if the ItemDTOs are equal.
     *
     * @param otherObj
     * @return
     */
    public boolean equals(Object otherObj){
        if(otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        ItemDTO otherCasted = (ItemDTO) otherObj;
        if (!(this.identifier == otherCasted.identifier)) return false;
        return true;
    }
}
