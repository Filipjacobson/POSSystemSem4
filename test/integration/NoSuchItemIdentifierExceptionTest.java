package integration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.ItemIdentifier;

/**
 *
 */
public class NoSuchItemIdentifierExceptionTest {
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
        inventorySystem = null;
    }

    /**
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


