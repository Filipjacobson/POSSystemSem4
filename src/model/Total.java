package model;

import util.Discount;
import integration.SaleDTO;

/**
 *
 */
public class Total {
    private double total = 0;
    private boolean addedDiscount = false;

    /**
     *
     */
    public Total(){

    }

    /**
     *
     * @param saleDTO
     */
    public void calculateTotal(SaleDTO saleDTO){
        for(ItemOnSale in : saleDTO.getList()){
            this.total = in.getQuantity() * in.getItemPrice();
        }
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
}
