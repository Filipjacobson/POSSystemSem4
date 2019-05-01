package model;

import util.Discount;
import integration.SaleDTO;


public class Total {
    private double total = 0;

    public Total(){

    }

    public void calculateTotal(SaleDTO saleDTO){
        for(ItemOnSale in : saleDTO.getList()){
            this.total = in.getQuantity() * in.getItemPrice();
        }
    }

    public void applyDiscount(Discount discount){
        this.total = total * discount.getCustomerDiscountConstant();
    }
}
