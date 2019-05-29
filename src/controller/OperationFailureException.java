package controller;

public class OperationFailureException extends Exception {
    public OperationFailureException(String errorMsg) {
        super(errorMsg);
    }
}