package model;

import integration.SaleDTO;

import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;

/**
 *
 */

public class Receipt {
    private final SaleDTO saleDTO;

    /**
     * Creates a new instance.
     *
     * @param saleDTO The sale provided by this receipt.
     */
    public Receipt(SaleDTO saleDTO){
        this.saleDTO = saleDTO;
    }

    /**
     *
     * @return
     */
    public String createReceiptString(){
        StringBuilder builder = new StringBuilder();
        appendLine(builder, "Sale number ");
        endSection(builder);

        LocalDateTime salesTime = LocalDateTime.now();
        builder.append("Time: ");
        appendLine(builder, salesTime.toString());
        endSection(builder);

        // Insert support for printing the items.

        return builder.toString();
    }

    /**
     *
     * @param builder
     * @param text
     */
    private void appendLine(StringBuilder builder, String text){
        builder.append(text);
        builder.append("\n");
    }

    /**
     *
     * @param builder
     */
    private void endSection(StringBuilder builder){
        builder.append("\n");
    }
}
