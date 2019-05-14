package model;

import integration.SaleDTO;

import java.time.LocalDateTime;

/**
 * An object modelling the receipt.
 */
public class Receipt {
    private SaleDTO saleDTO;

    /**
     * Creates a new instance.
     *
     * @param saleDTO Takes parameter and stores it in the object.
     */
    public Receipt(SaleDTO saleDTO){
        this.saleDTO = saleDTO;
    }

    /**
     * Converts the receipt to String.
     *
     * @return Receipt as String.
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        builder.append(System.getProperty("line.separator"));
        builder.append("------ THIS IS THE RECEIPT ------");
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append("_________________________");
        builder.append(System.getProperty("line.separator"));
        builder.append(" >> SALES INFORMATION << ");
        builder.append(System.getProperty("line.separator"));
        builder.append("-------------------------");
        builder.append(System.getProperty("line.separator"));
        builder.append("Organisation number: 556951-1111");
        builder.append(System.getProperty("line.separator"));
        builder.append("Organisation address: Tomtegatan 10, 111 10 Tomteby");
        builder.append(System.getProperty("line.separator"));
        builder.append("Cashier serving you: " + saleDTO.getCashier());
        builder.append(System.getProperty("line.separator"));
        builder.append("Sale number: 1");
        builder.append(System.getProperty("line.separator"));
        LocalDateTime salesTime = LocalDateTime.now();
        builder.append("Date/time: " + salesTime);
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append("_________________________");
        builder.append(System.getProperty("line.separator"));
        builder.append("       >> ITEMS << ");
        builder.append(System.getProperty("line.separator"));
        builder.append("-------------------------");
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        for(ItemOnSale item : saleDTO.getItems()){
            builder.append(item);
        }
        builder.append(System.getProperty("line.separator"));
        builder.append("------");
        builder.append(System.getProperty("line.separator"));
        builder.append("Total number of articles: " + saleDTO.getTotalNumberOfItems());
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append("_________________________");
        builder.append(System.getProperty("line.separator"));
        builder.append("    >> TRANSACTION << ");
        builder.append(System.getProperty("line.separator"));
        builder.append("-------------------------");
        builder.append(System.getProperty("line.separator"));
        builder.append("Subtotal: \t\t" + saleDTO.getTotal() + " kr");
        builder.append(System.getProperty("line.separator"));
        builder.append("VAT 12%: \t\t" + (saleDTO.getTotal().getAmount()*0.12) + " kr");
        builder.append(System.getProperty("line.separator"));
        builder.append("------");
        builder.append(System.getProperty("line.separator"));
        builder.append("Total: \t\t\t" + saleDTO.getTotal() + " kr");
        builder.append(System.getProperty("line.separator"));
        builder.append("Paid amount: \t"  + saleDTO.getPayment().getPaidAmount() + " kr");
        builder.append(System.getProperty("line.separator"));
        builder.append("Payment method: Cash ");
        builder.append(System.getProperty("line.separator"));
        builder.append("------");
        builder.append(System.getProperty("line.separator"));
        builder.append("Payment approved");
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append("Change: \t\t" + saleDTO.getPayment().getChange() + " kr");
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append("\n------      THANK  YOU      ------");
        builder.append(System.getProperty("line.separator"));
        builder.append("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        builder.append(System.getProperty("line.separator"));
        return builder.toString();
    }
}
