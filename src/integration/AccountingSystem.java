package integration;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages the accounting system, thus here is no accounting system in this program.
 */
public class AccountingSystem {
    private List<SaleDTO> accountingSystemLog = new ArrayList<>();

    /**
     * Creates a new instance.
     */
    public AccountingSystem(){

    }

    /**
     * Adds a SaleDTO to the accounting system.
     *
     * @param saleDTO The SaleDTO to be added to the accounting system.
     */
    public void updateAccountingSystem(SaleDTO saleDTO){
        accountingSystemLog.add(saleDTO);
    }

    /**
     * Gets the list of Sales stored in accounting system.
     *
     * @return The list of SaleDTOs.
     */
    public List<SaleDTO> getAccountingSystemLog(){
        return this.accountingSystemLog;
    }
}
