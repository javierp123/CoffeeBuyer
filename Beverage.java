import java.util.ArrayList;

/**
 * This class Beverage will implement the buyable interface and will categorize decaf coffee, coffee and tea 
 */
public abstract class Beverage implements Buyable {
    /**
     * This instance variable will categorize a beverage as Large but will be in Integer. ex. LARGE coffee
     */
    public static int LARGE = 2;

    /**
     * This instance variable eill categorize the beverage as Small but will be held in Integer. ex SMALL coffee
     */
    public static int SMALL = 0;

    /**
     * this protected instance variable is to hold the addOns in for the Beverage in an arrayList. ex SugarSyrup, oatMilk  
     */
    protected ArrayList<Addition> addOns = new ArrayList<Addition>();

    /**
     * this protected instance variable will also set size that is declared as an Int when received.
     */
    protected int size;





    /**
     *this method will get the cost of a beverage 
     *@return Should return the cost of a beverage in a money class 
     */

    public abstract Money getCost();


    /**
     * This method will get the calories of a beverage
     * @return Will return the calories of a beverage in a integer
     */
    public abstract int getCalories();

    /**
     * this method will set the size of a beverage
     * @param size can be 0 or 2 for small or large 
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * this method will add to the beverage what ever AddOn the user request 
     * @param addOn will be SugarSyruyp or OatMilk
     */
    public void addToDrink(Addition addOn) {
        addOns.add(addOn);


    }



}
