package model;

import integration.ItemDTO;
import util.Amount;
import util.ItemIdentifier;

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

    public Amount getItemPriceAsAmount(){
        return this.itemDTO.getItemPriceAsAmount();
    }

    /**
     *
     */
    public void incrementQuantity(){
        this.quantity++;
    }


    /**
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(itemDTO.getDescription() + "\t");


        builder.append(System.getProperty("line.separator"));
        builder.append("* " + quantity + "\t\t");
        builder.append("á pris: " + itemDTO.getItemDTOPrice());
        builder.append(System.getProperty("line.separator"));
        builder.append("\t\t\t\t\t" + itemDTO.getItemDTOPrice().getAmount()*quantity + " kr ");
        builder.append("(VAT: " + itemDTO.getVATRate() + "%)");
        builder.append(System.getProperty("line.separator"));
        return builder.toString();
    }
}
