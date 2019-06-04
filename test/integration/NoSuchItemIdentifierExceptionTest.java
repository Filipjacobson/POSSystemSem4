package integration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.ItemIdentifier;

/**
 * Test for class NoSuchItemIdentifierException.
 */
public class NoSuchItemIdentifierExceptionTest {
    private InventorySystem inventorySystem;

    /**
     * Things to set up before test.
     */
    @Before
    public void setUp(){
        this.inventorySystem = new InventorySystem();
    }

    /**
     * Things to clean up after test.
     */
    @After
    public void tearDown(){
        inventorySystem = null;
    }

    /**
     * Testing that the correct exception is thrown. Tests if expectedResult is equal to result.
     *
     * @throws Exception
     */
    @Test
    public void testNoSuchItemIdentifierException() throws NoSuchItemIdentifierException {
        String expectedResult = "There was no item with this item identifier.";
        try{
            inventorySystem.getItemFromInventory(new ItemIdentifier(9999));
        }
        catch(DatabaseConnectionFailureException | NoSuchItemIdentifierException e){
            String result = e.getMessage();
            Assert.assertEquals("The correct exception was thrown.", expectedResult, result);
        }
    }
}


