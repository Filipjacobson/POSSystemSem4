package view;

import model.TotalRevenueObserver;
import util.Amount;

/**
 *
 */
public class TotalRevenueView implements TotalRevenueObserver {
    private Amount totalRevenue = new Amount(0);

    /**
     *
     * @param total
     */
    public void newTotal(Amount total){
        totalRevenue.add(total);
        printTotal();
    }

    /**
     *
     */
    private void printTotal(){
        System.out.println("*VIEW FROM INSIDE THE POS SYSTEM* The total revenue is: " + totalRevenue.getAmount() + "\n\n");
    }
}
