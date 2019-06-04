package integration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.ItemIdentifier;

/**
 * Test for class DataBaseConnectionFailureException
 */
public class DataBaseConnectionFailureExceptionTest {
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
        this.inventorySystem = null;
    }

    /**
     * Testing that DatabaseConnectionFailureException is thrown. Tests if expectedResult is equal to result.
     *
     * @throws DatabaseConnectionFailureException
     */

    @Test
    public void testDataBaseConnectionFailureException() throws DatabaseConnectionFailureException {
        String expectedResult = "Could not connect to the inventory system.";
        try{
            inventorySystem.setInventoryListNull();
            inventorySystem.getItemFromInventory(new ItemIdentifier(9999));
        }
        catch(DatabaseConnectionFailureException | NoSuchItemIdentifierException e){
            String result = e.getMessage();
            Assert.assertEquals("The correct exception was thrown.", expectedResult, result);
        }
    }
}

