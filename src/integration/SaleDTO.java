package integration;

import model.ItemOnSale;
import model.Total;
import util.Amount;

import java.util.List;
import java.time.LocalDateTime;

/**
 *
 */
public final class SaleDTO {
    private final Total total;
    private final List<ItemOnSale> list;
    private final ItemOnSale lastAddedItem;
    private final String cashier;
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
    public SaleDTO(Total total, List<ItemOnSale> list, ItemOnSale lastAddedItem, String cashier, Amount amountPaid){
        this.total = total;
        this.list = list;
        this.lastAddedItem = lastAddedItem;
        this.cashier = cashier;
        this.amountPaid = amountPaid;
    }

    /**
     *
     * @return
     */
    public List<ItemOnSale> getItemOnSaleList(){
        return this.list;
    }

    public Total getTotal(){
        return total;
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

    public Amount getAmountPaid(){
        return amountPaid;
    }

    public Amount getChange(){
        return null;
    }
}
