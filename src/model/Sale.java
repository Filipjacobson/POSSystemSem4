package model;

import integration.ItemDTO;
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
    private Total total;
    private SaleDTO saleDTO;
    private ItemDTO lastItemScanned;
    private Amount paidAmount;
    private Amount change;

    private List<ItemOnSale> list = new ArrayList<>();
    private int numberOfPurchasedItems = 0;

    /**
     * Creates a new instance.
     */
    public Sale (){

        saleDTO = new SaleDTO(total, list, list.get(list.size()-1), "Hasse", change);
        total = new Total();
        payment = new Payment(saleDTO);
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

    public Total getTotal(){
        return total;
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

    /**
     *
     * @param paidAmount
     * @return
     */
    public Amount pay(Amount paidAmount){
        this.change = payment.pay(paidAmount);
        return change;
    }
}
