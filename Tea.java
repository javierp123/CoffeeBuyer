
/**
 * this class will be the tea object that is a beverage
 * @author javierpalma
 */

public class Tea extends Beverage{

    /**
     *this method will calculate the cost of a tea object including its addOns
     *@return Will return the cost of a tea object 
     */
    public Money getCost() {
        Money total = new Money(0);
        if (size == SMALL) {              
            total = total.add(new Money(150));
        } else {
            total = total.add(new Money(150));
        }

        for (int i = 0; i < addOns.size();i++) {
            total = total.add(addOns.get(i).getCost());

        }


        return total;

    }
    /**
     *
     *this method will get the calories of a tea object
     *@return will return the amount of calories in a tea 
     */
    public int getCalories() {            
        int calories = 5;

        for (int i = 0; i < addOns.size();i++) {
            calories = calories + addOns.get(i).getCalories();
        }


        return calories;

    }

    /**
     *this method will return the string version of a tea object 
     */
    public String toString() {           
        String Tea = "Tea";
        if (addOns.size() >= 1) {
            for (int i = 0; i< addOns.size();i++) {
                Tea = Tea + "+" + addOns.get(i).toString(); 
            }
        }

        if (size == SMALL) {
            Tea = Tea + " (S) - " + getCalories() + " calories";
        } else {
            Tea = Tea + " (L) - " + getCalories()+ " calories";
        }

        return Tea;


    }
    

}
