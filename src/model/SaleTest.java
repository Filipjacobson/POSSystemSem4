package model;

import util.CustomerIdentification;
import util.Discount;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class SaleTest {
    private CustomerIdentification customerIdentification;
    private Discount discount;
    private Total total;

    @Before
    public void setUp(){
        this.customerIdentification = new CustomerIdentification("123");
        this.discount = new Discount(customerIdentification);
        this.total = new Total();
    }

    @After
    public void tearDown(){

    }

    @Test
    public void applyDiscount(Discount discount){
        total.applyDiscount(discount);
    }

}
