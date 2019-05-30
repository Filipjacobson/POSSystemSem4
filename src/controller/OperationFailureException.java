package controller;

/**
 * General exception to throw when any operation fails.
 */
public class OperationFailureException extends Exception {

    /**
     * Error when operation fails.
     *
     * @param errorMsg Error message to send to its super class.
     */
    public OperationFailureException(String errorMsg) {
        super(errorMsg);
    }
}