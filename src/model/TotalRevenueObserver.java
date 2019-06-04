package model;

import util.Amount;

/**
 * Interface that sets the rules for what the classes implementing this interface should adhere.
 */
public interface TotalRevenueObserver {

    /**
     * A class that should exist in the classes implementing this interface.
     */
    void newTotal(Amount total);
}
