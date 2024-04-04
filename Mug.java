
/**
 *this class create the mug object that will be buyable 
 * @author javierpalma
 * 
 */
public class Mug implements Buyable{
    /**
     * this method will get the cost of a mug
     *@return will return the price of a mug in a money object 
     */
    public Money getCost() {
        return new Money(1000);
    }


    /**
     *this method will return the string version of the mug object 
     */
    public String toString() {
        return "Classy Mug";
    }

}
