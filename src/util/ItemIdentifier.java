package util;

/**
 * An object modelling the item identifier.
 */
public class ItemIdentifier {
    private int itemIdentifier;

    /**
     * Creates a new instance.
     *
     * @param itemIdentifier The item identifier
     */
    public ItemIdentifier(int itemIdentifier){
        this.itemIdentifier = itemIdentifier;
    }

    /**
     * Gets the itemIdentifier from the ItemIdentifier.
     *
     * @return
     */
    public int getItemIdentifier(){
        return this.itemIdentifier;
    }

    /**
     * SUT: Used to test if the ItemIdentifiers are equal.
     *
     * @param otherObj The object of any object type.
     * @return Returns <code>true</code> if equal. Returns <code>false</code> if not equal.
     */
    public boolean equals(Object otherObj){
        if(otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        ItemIdentifier otherCasted = (ItemIdentifier) otherObj;
        if (!(this.itemIdentifier == otherCasted.itemIdentifier)) return false;
        return true;
    }

    /**
     * Converts the instance of ItemIdentifier to String.
     *
     * @return Item identifier as String.
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.getItemIdentifier());
        return builder.toString();
    }
}
