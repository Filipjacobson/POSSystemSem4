package data;

import util.ItemIdentifier;
import integration.ItemDTO;

/**
 * An object modelling the database. Managed and supervised by the DBHandler, thus here is no database in this program.
 * Calls to the database stop in the integration layer.
 */
public class Data {

    /**
     * Creates a new instance.
     */
    public Data(){

    }

    /**
     * Method for finding the itemInformationData based on itemIdentifier is not part of this task.
     *
     * @param itemIdentifier The item identifier of an item.
     * @return null for now, since this is not a part of the task.
     */
    public ItemDTO getItemInformationData(ItemIdentifier itemIdentifier){
        return null;
    }
}
