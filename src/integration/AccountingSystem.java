package integration;

/**
 *
 */
public class AccountingSystem {
    private List<SaleDTO> accountingLog = new ArrayList<>();

    /**
     * Creates a new instance.
     */
    public AccountingSystem(){

    }

    /**
     *
     * @param saleDTO
     */
    public void updateAccountingSystem(SaleDTO saleDTOToAdd){
        accountingLog.add(saleDTOToAdd);
    }

    public List<SaleDTO> getAccountingSystemLog(){
        return this.accountingLog;
    }
}
