package model;

import integration.ItemDTO;
import integration.Printer;
import integration.SaleDTO;
import util.ItemIdentifier;
import util.Discount;
import util.Amount;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Sale {
    private Payment payment;
    private SaleDTO saleDTO;
    private ItemDTO lastItemScanned;
    private Printer printer;
    private Amount total;
    private Amount paidAmount;
    private Amount change;

    private List<ItemOnSale> list = new ArrayList<>();
    private int numberOfPurchasedItems = 0;

    /**
     * Creates a new instance.
     */
    public Sale (){

    }

    /**
     *
     * @param itemBeeingAddedToSale
     * @return
     */
    public void addItem(ItemOnSale itemBeeingAddedToSale){
        for(ItemOnSale itemInList : list){
            if(itemInList.getItemDTO().equals(itemBeeingAddedToSale)){
                lastItemScanned = itemBeeingAddedToSale.getItemDTO();
                itemInList.incrementQuantity();
                return;
            }
        }
        list.add(itemBeeingAddedToSale);
        lastItemScanned = itemBeeingAddedToSale.getItemDTO();


        total.reCalculateTotal(itemBeeingAddedToSale);
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

    /**
     *
     * @param discount
     */
    public void applyDiscount(Discount discount){
        total.applyDiscount(discount);
        // add support to update receipt with details about the discount if needed.
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
