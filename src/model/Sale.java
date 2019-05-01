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
    private Amount paidAmount;
    private Amount change;

    private List<ItemOnSale> list = new ArrayList<>();
    private int numberOfPurchasedItems = 0;

    public Sale (){


        // To give the program some sample data we add
        list.add(new ItemOnSale(new ItemDTO("Milk", 10, new ItemIdentifier(), 12), 2));
        list.add(new ItemOnSale(new ItemDTO("Lemonade", 12, new ItemIdentifier(), 12), 1));

        saleDTO = new SaleDTO(total, list, list.get(list.size()-1), "Hasse", change);
        total = new Total();
        payment = new Payment(saleDTO);
    }

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

    public Sale getSale(){
        return this;
    }

    public void applyDiscount(Discount discount){
        total.applyDiscount(discount);
        // add support to update receipt with details about the discount if needed.
    }

    public Amount pay(Amount paidAmount){
        this.change = payment.pay(paidAmount);
        return change;
    }
}
