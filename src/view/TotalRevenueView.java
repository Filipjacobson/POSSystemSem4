package view;

import model.TotalRevenueObserver;
import util.Amount;

/**
 * Holds the information about the total in the view. Responsible for implementing TotalRevenueObserver and printing to
 * cmd (for test purposes when UI missing) in this program for seminar 4.
 */
public class TotalRevenueView implements TotalRevenueObserver {
    private Amount totalRevenue = new Amount(0);

    /**
     * Adds the new total revenue.
     *
     * @param total
     */
    public void newTotal(Amount total){
        totalRevenue.add(total);
        printTotal();
    }

    /**
     * Prints the total to the cashier in the view.
     */
    private void printTotal(){
        System.out.println("*VIEW FROM INSIDE THE POS SYSTEM* The total revenue is: " + totalRevenue.getAmount() + "\n\n");
    }
}
