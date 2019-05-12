package integration;

public class SystemCreator {
    private AccountingSystem accountingSystem;
    private InventorySystem inventorySystem;
    private Printer printer;

    public SystemCreator(){
        accountingSystem = new AccountingSystem();
        inventorySystem = new InventorySystem();
        printer = new Printer();
    }

    public AccountingSystem getAccountingSystem() {
        return accountingSystem;
    }

    public InventorySystem getInventorySystem() {
        return inventorySystem;
    }

    public Printer getPrinter() {
        return printer;
    }
}
