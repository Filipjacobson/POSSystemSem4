package integration;

import model.ItemOnSale;
import model.Payment;
import model.Sale;
import util.Amount;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains information about the item, as a DTO.
 */
public final class SaleDTO {
    private List<ItemOnSale> list = new ArrayList<>();
    private final Payment payment;
    private final ItemDTO lastAddedItem;
    private final Amount total;
    private final String cashier = "Jarko";

    /**
     * Creates a new instance.
     *
     * @param sale
     */
    public SaleDTO(Sale sale){
        this.list = sale.getList();
        this.payment = sale.getPayment();
        this.lastAddedItem = sale.getLastAddedItem();
        this.total = sale.getTotal();
    }

    /**
     *
     * @return
     */
    public int getTotalNumberOfItems(){
        int counter = 0;
        for (ItemOnSale item : list){
            counter++;
        }
        return counter;
    }

    /**
     * Gets the list of ItemOnSale from the SaleDTO.
     *
     * @return The SaleDTO's list of ItemOnSale.
     */
    public List<ItemOnSale> getItems() {
        return list;
    }

    /**
     * Gets the payment from the SaleDTO.
     *
     * @return The SaleDTO payment.
     */
    public Payment getPayment(){
        return payment;
    }

    /**
     * Gets the total from the SaleDTO.
     *
     * @return The SaleDTO total.
     */
    public Amount getTotal(){
        return total;
    }

    /**
     * Gets the cashier from the SaleDTO.
     *
     * @return The SaleDTO cashier.
     */
    public String getCashier(){
        return cashier;
    }


    /**
     * SUT: Used to test if the SaleDTOs are equal.
     *
     * @param otherObj
     * @return Returns <code>true</code> if equal. Returns <code>false</code> if not equal.
     */
    public boolean equals(Object otherObj){
        if(otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        SaleDTO otherCasted = (SaleDTO) otherObj;
        if(list.size() < 1 && otherCasted.list.size() < 1) return true;
        for(int i = 0; i < this.list.size(); i++){
            if(!this.list.get(i).equals(otherCasted.list.get(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * Converts the instance of SaleDTO to String.
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        return builder.toString();
    }
}
