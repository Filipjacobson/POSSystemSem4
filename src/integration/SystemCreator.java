package integration;

/**
 * Holds the external systems.
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
     * Get method to access the accounting system.
     *
     * @return The accounting system.
     */
    public AccountingSystem getAccountingSystem() {
        return accountingSystem;
    }

    /**
     * Get method to access the inventory system.
     *
     * @return The inventory system.
     */
    public InventorySystem getInventorySystem() {
        return inventorySystem;
    }
}
