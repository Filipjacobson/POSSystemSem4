package model;

import integration.ItemDTO;
import integration.Printer;
import integration.SaleDTO;
import util.ItemIdentifier;
import util.Amount;

import java.util.ArrayList;
import java.util.List;

/**
 * SALE
 */
public class Sale {
    private Payment payment;
    private ItemDTO lastItemScanned;
    private Amount total;

    private List<ItemOnSale> list = new ArrayList<>();

    /**
     * Creates a new instance.
     */
    public Sale (){

    }

    /**
     *
     * @param itemBeingAddedToSale
     * @return
     */
    public void addItem(ItemOnSale itemBeingAddedToSale){
        for(ItemOnSale itemInList : list){
            if(itemInList.getItemDTO().equals(itemBeingAddedToSale)){
                lastItemScanned = itemBeingAddedToSale.getItemDTO();
                itemInList.incrementQuantity();
                return;
            }
        }
        list.add(itemBeingAddedToSale);
        lastItemScanned = itemBeingAddedToSale.getItemDTO();


        total.reCalculateTotal(itemBeingAddedToSale);
    }


    /**
     *
     * @return
     */
    public Sale getSale(){
        return this;
    }

    public double getTotal(){
        return total.getAmount();
    }

    public ItemDTO getLastItemScanned(){
        return lastItemScanned;
    }

    public Payment getPayment(){
        return payment;
    }


    public void addToPayment(Payment payment){
        payment.calculateTotal(total);
        this.payment = payment;
    }

    public void printReceipt(Printer printer){
        Receipt receipt = new Receipt(new SaleDTO());
        printer.print(receipt);
    }
}
