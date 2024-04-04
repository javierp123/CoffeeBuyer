
/**
 * this class extends the coffee class that will be the decaf coffee beverage
 * @author javierpalma
 */
public class DecafCoffee extends Coffee{


    /**
     *this method will return the string version of a decaf Coffee
     */
    @Override
    public String toString() {   
        String Coffee = "Decaf Coffee";
        if (addOns.size() >= 1) {
            for (int i = 0; i< addOns.size();i++) {
                Coffee = Coffee + "+" + addOns.get(i).toString(); 
            }
        }
        if (size == SMALL) {
            Coffee = Coffee + " (S) - " + getCalories() + " calories";
        } else {
            Coffee = Coffee + " (L) - " + getCalories() + " calories";
        }



        return Coffee;


    }

}
