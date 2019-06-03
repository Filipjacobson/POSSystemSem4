package controller;

import integration.SaleDTO;
import integration.SystemCreator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class OperationFailureExceptionTest {
    private Controller contr;
    /**
     *
     */
    @Before
    public void setUp(){
        SystemCreator systemCreator = new SystemCreator();
        contr = new Controller(systemCreator);
    }

    /**
     *
     */
    @After
    public void tearDown(){
        contr = null;
    }

    /**
     * Checked exception.
     *
     * @throws Exception
     */
    @Test
    public void testOperationFailureException() throws OperationFailureException {
        String expectedResult = "There was no item with this item identifier.";
        try{
            SaleDTO saleDTO = contr.addItem(0000, 1);
        }
        catch(OperationFailureException e){
            String result = e.getMessage();
            Assert.assertEquals("The correct exception was thrown.", expectedResult, result);
        }
    }
}


