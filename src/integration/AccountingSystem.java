package integration;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class AccountingSystem {
    private List<SaleDTO> accountingSystemLog = new ArrayList<>();

    /**
     * Creates a new instance.
     */
    public AccountingSystem(){

    }

    /**
     *
     * @param
     */
    public void updateAccountingSystem(SaleDTO saleDTO){
        accountingSystemLog.add(saleDTO);
    }

    public List<SaleDTO> getAccountingSystemLog(){
        return this.accountingSystemLog;
    }
}
