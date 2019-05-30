package integration;

/**
 *
 */
public class NoSuchItemIdentifierException extends Exception{

    /**
     *
     * @param errorMsg
     */
    public NoSuchItemIdentifierException(String errorMsg){
        super(errorMsg);
    }
}
