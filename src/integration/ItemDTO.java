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
    private final String expiryDate = "Infinite";

    /**
     * Creates a new instance.
     *
     * @param description The description of the item.
     * @param price The price of the item.
     * @param identifier The item identifier of the item.
     * @param VATrate The VAT-rate of the item.
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
     * @param otherObj The object of any object type.
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
     * @return The instance of ItemDTO as String.
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.getItemDTODescription() + "\t" + this.getItemDTOIdentifier() + "\t" + this.getItemDTOPrice());
        return builder.toString();
    }
}
