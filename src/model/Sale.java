package model;

import integration.ItemDTO;
import integration.Printer;
import integration.SaleDTO;
import util.Amount;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds information about the sale.
 */
public class Sale {
    private List<ItemOnSale> list = new ArrayList<>();
    private Payment payment;
    private ItemDTO lastAddedItem;
    private Amount total;

    /**
     * Creates a new instance.
     */
    public Sale (){

    }

    /**
     * Adds an item to the sale.
     *
     * @param itemBeingAddedToSale The item to be added.
     * @return
     */
    public void addItem(ItemOnSale itemBeingAddedToSale){
        for(ItemOnSale itemInList : list){
            if(itemInList.getItemDTO().equals(itemBeingAddedToSale.getItemDTO())){
                lastAddedItem = itemBeingAddedToSale.getItemDTO();
                itemInList.incrementQuantity();
                this.total.add(itemBeingAddedToSale.getItemPriceAsAmount());
                return;
            }
        }
        list.add(itemBeingAddedToSale);
        lastAddedItem = itemBeingAddedToSale.getItemDTO();
        this.total.add(itemBeingAddedToSale.getItemPriceAsAmount());
    }

    public void addPayment(Payment payment){
        payment.calculateTotal(total);
        this.payment = payment;
    }

    public void printReceipt(Printer printer){
        Receipt receipt = new Receipt(new SaleDTO(this));
        printer.print(receipt);
    }


    /**
     *
     * @return
     */
    public Sale getSale(){
        return this;
    }

    public List<ItemOnSale> getList() {
        return list;
    }

    public Payment getPayment(){
        return payment;
    }

    public ItemDTO getLastAddedItem(){
        return lastAddedItem;
    }

    public Amount getTotal(){
        return total;
    }
}
