package controller;

import integration.SaleDTO;
import integration.SystemCreator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test for class OperationFailureException
 */
public class OperationFailureExceptionTest {
    private Controller contr;

    /**
     * Things to set up before test.
     */
    @Before
    public void setUp(){
        SystemCreator systemCreator = new SystemCreator();
        contr = new Controller(systemCreator);
    }

    /**
     * Things to clean up after test.
     */
    @After
    public void tearDown(){
        contr = null;
    }

    /**
     * Checked exception.
     * Testing that OperationFailureException is thrown. Tests if expectedResult is equal to result.
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


