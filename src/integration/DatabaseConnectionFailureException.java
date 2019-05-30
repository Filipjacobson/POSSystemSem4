package integration;

/**
 * Exception to throw when we could not connect to the database (it returning null value for this example).
 */
public class DatabaseConnectionFailureException extends Exception{

    /**
     * Error when operation fails.
     *
     * @param errorMsg Error message to send to its super class.
     */
    public DatabaseConnectionFailureException(String errorMsg){
        super(errorMsg);
    }
}
