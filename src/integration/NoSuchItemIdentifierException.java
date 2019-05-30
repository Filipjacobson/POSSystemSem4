package integration;

/**
 * Exception to throw when item identifier is not found in inventory system.
 */
public class NoSuchItemIdentifierException extends Exception{

    /**
     * Error when operation fails.
     *
     * @param errorMsg Error message to send to its super class.
     */
    public NoSuchItemIdentifierException(String errorMsg){
        super(errorMsg);
    }
}
