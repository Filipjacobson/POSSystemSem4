package util;

/**
 *
 */
public class Discount {
    private CustomerIdentification customerIdentification;
    private final boolean eligibleForDiscount = true;
    private final double discountConstant = 0.95;

    /**
     *
     * @param customerIdentification
     */
    public Discount(CustomerIdentification customerIdentification){
        this.customerIdentification = customerIdentification;
    }

    /**
     *
     * @return
     */
    public double getCustomerDiscountConstant(){
        return discountConstant;
    }
}
