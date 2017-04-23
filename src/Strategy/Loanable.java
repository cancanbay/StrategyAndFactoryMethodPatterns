package Strategy;

import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public class Loanable implements IBookSellingTypeBehavior {
    @Override
    public String saySellingType() {
        return "Loanable";
    }
}
