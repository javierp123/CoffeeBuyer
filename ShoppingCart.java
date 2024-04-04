import java.util.ArrayList;

/**
 * this class will be the shopping cart that will hold all the buyable items
 * @author javierpalma
 * 
 */
public class ShoppingCart {


    /**
     * this instance variable will an array list that will hold the buyable items that are in a shopping cart
     */
    private ArrayList<Buyable> items =  new ArrayList<Buyable>();


    /**
     * this method will add buyable items into the arraylist Items
     * @param item can be ex, Coffee, tea, mug 
     */
    public void addItem(Buyable item) {
        items.add(item);

    }

    /**
     * this method will get the total cost of items in a cart 
     * @return will return the total cost of items in a money object
     */
    public Money getTotal() {
        Money cost = new Money(0);
        for(int i = 0; i < items.size();i++) {
            cost = cost.add(items.get(i).getCost()); 

        }
        cost = cost.add(Money.computeMNSalesTax(cost));


        return cost;
    }


    /**
     * this method will return the string version of a shopping cart 
     *
     */
    @Override
    public String toString() {
        String final1 = "";
        if(items.size() == 0) {
            return "Cart is empty";
        } 
        for (int i =0; i<items.size();i++) {
            final1 = final1 + (i+(int)1)+".) " + items.get(i) + ": " + items.get(i).getCost() +  "\n";
        }
        final1 = final1 + "Total: " + getTotal();

        return final1;
    }

}
