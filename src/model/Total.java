package model;

import integration.ItemDTO;
import util.Discount;
import integration.SaleDTO;

/**
 *
 */
public class Total {
    private double total = 0;
    private boolean addedDiscount = false;

    /**
     * Creates a new instance.
     */
    public Total(){

    }

    /**
     *
     * @param
     */
    public void reCalculateTotal(ItemOnSale item){
        this.total += item.getItemDTO().getItemDTOPrice();
    }

    /**
     *
     * @param discount
     */
    public void applyDiscount(Discount discount){
        if(addedDiscount){
            System.out.println("Customer discount already applied. ");
        } else {
            this.total = total * discount.getCustomerDiscountConstant();
            addedDiscount = true;
            System.out.println("Customer discount applied successfully. ");
        }

    }

    public double getTotal(){
        return total;
    }
}
