/**
 * this class will will create the sugarSyrup object that will be an addOn to beverage 
 * 
 */
public class SugarSyrup extends Addition {

    /**
     *this method will get the cost of sugarSyrup added on 
     *@return will return the cost of sugarSyrup in a money object
     */
    public Money getCost() {
        return new Money(50);
    }
    /**
     * this method will get the calories of the sugarSyrup  object
     * @return the amount of calories in an integer 
     *
     */
    public int getCalories() {
        return 60;
    }
    @Override
    /**
     *this method will return the string version of sugarSyrup
     */
    public String toString() {          
        return "Sugar Syrup";

    }


}