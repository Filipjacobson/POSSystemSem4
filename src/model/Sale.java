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
    private Amount total = new Amount (0);

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
    public SaleDTO addItem(ItemOnSale itemBeingAddedToSale){
        this.total.add(itemBeingAddedToSale.getItemPrice().multiply(new Amount(itemBeingAddedToSale.getQuantity())));
        for(ItemOnSale itemInList : list){
            if(itemInList.getItemDTO().equals(itemBeingAddedToSale.getItemDTO())){
                lastAddedItem = itemBeingAddedToSale.getItemDTO();
                itemInList.incrementQuantity(itemBeingAddedToSale.getQuantity());
                return new SaleDTO(this);
            }
        }
        list.add(itemBeingAddedToSale);
        lastAddedItem = itemBeingAddedToSale.getItemDTO();
        return new SaleDTO(this);
    }

    /**
     *
     * @param payment
     */
    public void addPayment(Payment payment){
        payment.calculateTotal(total);
        this.payment = payment;
    }

    /**
     *
     * @param printer
     */
    public void printReceipt(Printer printer){
        Receipt receipt = new Receipt(new SaleDTO(this));
        printer.print(receipt);
    }

    /**
     *
     * @return
     */
    public List<ItemOnSale> getList() {
        return list;
    }

    /**
     *
     * @return
     */
    public Payment getPayment(){
        return payment;
    }

    /**
     *
     * @return
     */
    public ItemDTO getLastAddedItem(){
        return lastAddedItem;
    }

    /**
     *
     * @return
     */
    public Amount getTotal(){
        return total;
    }
}
