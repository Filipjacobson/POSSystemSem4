package integration;

import model.ItemOnSale;
import util.Amount;

import java.util.List;

/**
 *
 */
public final class SaleDTO {

    private final List<ItemOnSale> list;
    private final ItemOnSale lastAddedItem;
    private final String cashier;
    private final Amount total;
    private final Amount amountPaid;
    private final Amount change;


    /**
     * Creates a new instance.
     *
     * @param total
     * @param list
     * @param lastAddedItem
     * @param cashier
     */
    public SaleDTO(Amount total, List<ItemOnSale> list, ItemOnSale lastAddedItem, String cashier, Amount amountPaid){
        this.total = total;
        this.list = list;
        this.lastAddedItem = lastAddedItem;
        this.cashier = cashier;
        this.amountPaid = amountPaid;
        this.change = null;
    }

    /**
     *
     * @return
     */
    public List<ItemOnSale> getItemOnSaleList(){
        return this.list;
    }

    public double getTotal(){
        return total.getAmount();
    }

    public String getCashier(){
        return cashier;
    }

    public int getTotalNumberOfItems(){
        int i = 0;
        for (ItemOnSale item : list){
            i++;
        }
        return i;
    }

    public double getAmountPaid(){
        return amountPaid.get;
    }

    public Amount getChange(){
        return null;
    }
}
