package model;

import integration.ItemDTO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.Amount;
import util.ItemIdentifier;
import static org.junit.Assert.*;

/**
 * Test for class ItemOnSale.
 */
public class ItemOnSaleTest {
    /**
     *
     */
    @Before
    public void setUp(){

    }

    /**
     *
     */
    @After
    public void tearDown(){

    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testIncrementQuantity() throws Exception {
        int quantityToBeIncremented = 1;
        ItemDTO itemDTOTest = new ItemDTO("Milk 1l", new Amount(10), new ItemIdentifier(3456), 12);
        ItemOnSale itemOnSaleTest = new ItemOnSale(itemDTOTest, quantityToBeIncremented);
        itemOnSaleTest.incrementQuantity(quantityToBeIncremented);
        int expectedResult = 2;
        int result = itemOnSaleTest.getQuantity();
        assertEquals("Same quantity, not equal", expectedResult, result);
    }

    /**
     *
     * @throws Exception
     */
    @Test
    public void testToString() throws Exception {
        ItemDTO itemDTOTest = new ItemDTO("Milk 1l", new Amount(10), new ItemIdentifier(3456), 12);
        int itemQuantity = 2;
        ItemOnSale itemOnSaleTest = new ItemOnSale(itemDTOTest, itemQuantity);
        String expectedResult =
                itemDTOTest.getItemDTODescription()
                + "\t\t" + itemQuantity + " st * " + itemDTOTest.getItemDTOPrice()
                + "kr " + "\t\t" + itemDTOTest.getItemDTOPrice().getAmount()*itemQuantity + " kr "
                + System.getProperty("line.separator");
        String result = itemOnSaleTest.toString();
        assertEquals("Same quantity, not equal", expectedResult, result);
    }
}