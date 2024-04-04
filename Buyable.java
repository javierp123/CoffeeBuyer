
/**
 * This interface will hold mug and beverage and make them buyable items.
 * @author javierpalma
 */
public abstract interface Buyable {

    /**
     * this method will get the cost of a beverage or a mug
     * @return will return the cost of a buyable item in a money class
     */
    public abstract Money getCost();

}