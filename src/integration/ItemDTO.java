package integration;

import util.Amount;
import util.ItemIdentifier;

/**
 * Contains information about the item, as a DTO.
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
     * Gets the item identifier from the ItemDTO.
     *
     * @return The ItemDTO identifier.
     */
    public ItemIdentifier getItemDTOIdentifier() {
        return identifier;
    }

    /**
     * Gets the price from the ItemDTO.
     *
     * @return The ItemDTO price.
     */
    public Amount getItemDTOPrice(){
        return this.price;
    }

    /**
     * Gets the description from the ItemDTO.
     *
     * @return The ItemDTO description.
     */
    public String getItemDTODescription(){
        return this.description;
    }

    /**
     * SUT: Used to test if the ItemDTOs are equal.
     *
     * @param otherObj
     * @return Returns <code>true</code> if equal. Returns <code>false</code> if not equal.
     */
    public boolean equals(Object otherObj){
        if(otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        ItemDTO otherCasted = (ItemDTO) otherObj;
        if (!(this.identifier == otherCasted.identifier)) return false;
        return true;
    }

    /**
     * Converts the instance of ItemDTO to String.
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.getItemDTODescription() + "\t" + this.getItemDTOIdentifier() + "\t" + this.getItemDTOPrice());
        return builder.toString();
    }
}
