package model;

import integration.ItemDTO;
import integration.Printer;
import integration.SaleDTO;
import util.Amount;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds information about the sale.
 */
public class Sale {
    private List<ItemOnSale> list = new ArrayList<>();
    private Payment payment;
    private ItemDTO lastAddedItem;
    private Amount total = new Amount (0);

    /**
     * Creates a new instance.
     */
    public Sale (){

    }

    /**
     * Adds an item to the sale.
     *
     * @param itemBeingAddedToSale The item to be added.
     * @return A new SaleDTO of the current Sale.
     */
    public SaleDTO addItem(ItemOnSale itemBeingAddedToSale){
        this.total.add(itemTimesQuantity(itemBeingAddedToSale));
        for(ItemOnSale itemInList : list){
            if(itemInList.getItemDTO().equals(itemBeingAddedToSale.getItemDTO())){
                lastAddedItem = itemBeingAddedToSale.getItemDTO();
                itemInList.incrementQuantity(itemBeingAddedToSale.getQuantity());
                return new SaleDTO(this);
            }
        }
        list.add(itemBeingAddedToSale);
        lastAddedItem = itemBeingAddedToSale.getItemDTO();
        return new SaleDTO(this);
    }

    private Amount itemTimesQuantity(ItemOnSale itemBeingAddedToSale){
        return itemBeingAddedToSale.getItemPrice().multiply(new Amount(itemBeingAddedToSale.getQuantity()));
    }

    /**
     * Add payment to this instance.
     *
     * @param payment The payment.
     */
    public void addPayment(Payment payment){
        payment.addToTotal(total);
        this.payment = payment;
    }

    /**
     * Used to print the receipt.
     *
     * @param printer The printer that will print the receipt.
     */
    public void printReceipt(Printer printer){
        Receipt receipt = new Receipt(new SaleDTO(this));
        printer.print(receipt);
    }

    /**
     * Gets the list of ItemOnSale from the Sale.
     *
     * @return The Sale's list of ItemOnSales.
     */
    public List<ItemOnSale> getList() {
        return list;
    }

    /**
     * Gets the payment from the Sale.
     *
     * @return The Sale's payment.
     */
    public Payment getPayment(){
        return payment;
    }

    /**
     * Gets the last added item from the Sale.
     *
     * @return The Sale's last added item.
     */
    public ItemDTO getLastAddedItem(){
        return lastAddedItem;
    }

    /**
     * Gets the total from the Sale.
     *
     * @return The Sale's total.
     */
    public Amount getTotal(){
        return total;
    }
}
