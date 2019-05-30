package integration;

/**
 *
 */
public class DatabaseConnectionFailureException extends Exception{

    /**
     *
     * @param errorMsg
     */
    public DatabaseConnectionFailureException(String errorMsg){
        super(errorMsg);
    }
}
