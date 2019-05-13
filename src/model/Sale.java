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
        System.out.println("Trying to add the item found to the sale" + itemBeingAddedToSale.toString());
        for(ItemOnSale itemInList : list){
            if(itemInList.getItemDTO().equals(itemBeingAddedToSale.getItemDTO())){
                System.out.println("Item already on sale, adding its quantity");
                lastAddedItem = itemBeingAddedToSale.getItemDTO();
                itemInList.incrementQuantity();
                this.total.add(itemBeingAddedToSale.getItemPriceAsAmount());
                return new SaleDTO(this);
            }
        }
        System.out.println("Item was not on sale, adding item");
        list.add(itemBeingAddedToSale);
        System.out.println("Item added to sales list");
        lastAddedItem = itemBeingAddedToSale.getItemDTO();
        System.out.println("Last added item was updated");
        total.add(itemBeingAddedToSale.getItemPriceAsAmount());

        return new SaleDTO(this);
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
