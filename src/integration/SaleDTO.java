package integration;

import model.ItemOnSale;
import model.Payment;
import model.Sale;
import util.Amount;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds information about the sale, as a DTO.
 */
public final class SaleDTO {
    private List<ItemOnSale> list = new ArrayList<>();
    private final Payment payment;
    private final ItemDTO lastAddedItem;
    private final Amount total;
    private final String cashier = "Jarko";

    /**
     * Creates a new instance.
     */
    public SaleDTO(Sale sale){
        this.list = sale.getList();
        this.payment = sale.getPayment();
        this.lastAddedItem = sale.getLastAddedItem();
        this.total = sale.getTotal();
    }

    /**
     *
     * @return
     */
    public int getTotalNumberOfItems(){
        int i = 0;
        for (ItemOnSale item : list){
            i++;
        }
        return i;
    }

    /**
     *
     * @return
     */
    public List<ItemOnSale> getItems() {
        return list;
    }

    /**
     *
     * @return
     */
    public Payment getPayment(){
        return payment;
    }

    /**
     *
     * @return
     */
    public Amount getTotal(){
        return total;
    }

    /**
     *
     * @return
     */
    public String getCashier(){
        return cashier;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        return builder.toString();
    }
}
