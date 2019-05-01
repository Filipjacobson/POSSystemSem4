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
    private final LocalDateTime salesTime;
    private final Amount change;

    /**
     * Creates a new instance.
     *
     * @param total
     * @param list
     * @param lastAddedItem
     * @param cashier
     * @param change
     */
    public SaleDTO(Total total, List<ItemOnSale> list, ItemOnSale lastAddedItem, String cashier, Amount change){
        this.total = total;
        this.list = list;
        this.lastAddedItem = lastAddedItem;
        this.cashier = cashier;
        this.salesTime = LocalDateTime.now();
        this.change = change;
    }

    /**
     *
     * @return
     */
    public List<ItemOnSale> getList(){
        return this.list;
    }
}
