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
     * @param itemOnSale
     * @return
     */
    public SaleDTO addItem(ItemOnSale itemOnSale){
        //Check if item already is on sale, if no: add item, if yes: update quantity.
        for(ItemOnSale in : list){
            if(in.getItemDTO() == itemOnSale.getItemDTO()){
                in.addQuantity(itemOnSale.getQuantity());
                System.out.println("Item already found on sale. The total quantity of item " + in.toString() + " is now " + in.getQuantity());
            } else{
                list.add(itemOnSale);
                System.out.println("Added following item to sale: " + itemOnSale.toString());
                numberOfPurchasedItems++;
            }
        }
        total.calculateTotal(saleDTO);
        return saleDTO;
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
