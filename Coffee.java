
/**
 * this class will make a coffee object that extends beverage
 * @author javierpalma
 */
public class Coffee extends Beverage{

    /**
     *this method will calculate the cost of a coffee object including its addOns
     *@return Will return the cost of a coffee object 
     */
    public Money getCost() {
        Money total = new Money(0);
        if (size == SMALL) {
            total = total.add(new Money(150));
        } else {
            total = total.add(new Money(250));
        }
        for (int i = 0; i < addOns.size();i++) {
            total = total.add(addOns.get(i).getCost());  
        }

        return total;

    }
    /**
     *
     *this method will get the calories of a Coffee object
     *@return will return the amount of calories in a Coffee 
     */
    public int getCalories() {
        int calories = 0;
        if (size == SMALL) {
            calories = calories + 5;
        } else {
            calories = calories + 15;
        }

        for (int i = 0; i < addOns.size();i++) {
            calories = calories + addOns.get(i).getCalories();
        }

        return calories;



    }
    /**
     *This method will return a coffee object to print
     */
    public String toString() {            
        String Coffee = "Coffee";
        if (addOns.size() >= 1) {
            for (int i = 0; i< addOns.size();i++) {
                Coffee = Coffee + "+" + addOns.get(i).toString(); 
            }
        }
        if (size == SMALL) {
            Coffee = Coffee + " (S) - " + getCalories() + " calories";
        } else {
            Coffee = Coffee + "(L) - " + getCalories() + " calories";
        }



        return Coffee;
    }





}
