package model;

import integration.SaleDTO;

import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;

/**
 *
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
     *
     * @return
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
        int i = 1;
        for(ItemOnSale item : saleDTO.getItems()){
            builder.append("Item#"+i);
            builder.append(System.getProperty("line.separator"));
            builder.append(item);
            builder.append(System.getProperty("line.separator"));
            i++;
        }
        builder.append(System.getProperty("line.separator"));
        builder.append("Total number of items: " + saleDTO.getTotalNumberOfItems());
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
        builder.append("Total: " + saleDTO.getTotal());
        builder.append(System.getProperty("line.separator"));
        builder.append("Payment method: Card");
        builder.append(System.getProperty("line.separator"));


        builder.append("\n------      THANK  YOU      ------");
        builder.append(System.getProperty("line.separator"));

        builder.append("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        return builder.toString();
    }


}
