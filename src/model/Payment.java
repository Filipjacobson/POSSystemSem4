package model;

import util.Amount;
import integration.SaleDTO;
import integration.Printer;

/**
 *
 */
public class Payment {
    private SaleDTO saleDTO;
    private Receipt receipt;
    private Amount total;
    private Amount paidAmount;
    private Amount change;

    /**
     * Creates a new instance.
     *
     * @param saleDTO
     */
    public Payment(SaleDTO saleDTO){
        this.saleDTO = saleDTO;
        this.receipt = new Receipt(saleDTO);
    }

    /**
     *
     * @param paidAmount
     * @return
     */
    public Amount pay(Amount paidAmount){
        this.paidAmount = paidAmount;
        total.subtract(paidAmount); // add guard so that this valuue does not become negative.


        System.out.println("Payment approved!");
        System.out.println("Printing receipt... Please wait.");

        printer.print(receipt);
        return change;
    }
}
