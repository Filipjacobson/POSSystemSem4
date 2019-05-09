package util;

/**
 *
 */
public class CustomerIdentification {
    private String customerIdentification;

    /**
     * Creates a new instance.
     *
     * @param customerIdentification Takes parameter and stores it in the object.
     */
    public CustomerIdentification(String customerIdentification){
        this.customerIdentification = customerIdentification;
    }

    /**
     *
     * @return
     */
    public String getCustomerIdentification() {
        return customerIdentification;
    }
}
