package integration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.ItemIdentifier;


public class DataBaseConnectionFailureExceptionTest {
    private InventorySystem inventorySystem;
    /**
     *
     */
    @Before
    public void setUp(){
        this.inventorySystem = new InventorySystem();
    }

    /**
     *
     */

    @After
    public void tearDown(){
        this.inventorySystem = null;
    }

    /**
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

