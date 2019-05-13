package integration;

/**
 *
 */
public class SystemCreator {
    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;
    private Printer printer;

    /**
     * Creates a new instance.
     */
    public SystemCreator(){
        accountingSystem = new AccountingSystem();
        inventorySystem = new InventorySystem();
        printer = new Printer();
    }

    /**
     *
     * @return
     */
    public AccountingSystem getAccountingSystem() {
        return accountingSystem;
    }

    /**
     *
     * @return
     */
    public InventorySystem getInventorySystem() {
        return inventorySystem;
    }
}
