
/**
 * this class will will create the oat milk object that will be an addOn to beverage 
 * 
 */
public class OatMilk extends Addition{

    /**
     *this method will get the cost of oatmilk added on 
     *@return will return the cost of oatmilk in a money object
     */
    public Money getCost() {
        return new Money(100);
    }
    /**
     * this method will get the calories of the oatmilk object
     * @return the amount of calories in an integer 
     *
     */
    public int getCalories() {
        return 30;
    }
    /**
     *this method will return the string version of oatmilk 
     */
    @Override

    public String toString() {     
        return "Oatmilk";

    }

}
