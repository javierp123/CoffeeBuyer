
/**
 * this class will create a money object that will be the currency for the program
 * @author javierpalma
 */
public class Money {

    /**
     * this instance variable is protected but is the constant 0 
     */
    public static final Money ZERO = new Money(0);

    /**
     * this instance variable is protected but is the constant for 1 dollar
     */
    public static final Money ONEDOLLAR = new Money(100);

    /**
     * this instance variable is protected and is the constant for 2 dollars
     */
    public static Money TWODOLLAR = new Money(200);

    /**
     * this instance variable will hold the amount in cents and then convert it into a money object 
     */
    private int amountinCents;




    /**
     * this constructor will build a money object
     * @param amountInCents will be the amount in cents that will be then converted to money, ex. 100, 200, 204 
     */
    public Money(int amountInCents) {
        this.amountinCents = amountInCents;

    }

    /**
     * this method will receive a string and convert it to a money object
     * @param input can be ex , $5.30, $6.00, $8.00
     * @return will return a money object that is the amount of the inputed string
     */


    public static Money fromMoneyString(String input) { 
        String removed = input.replace("$","");  //4.50
        double money = Double.parseDouble(removed);     //4.50
        int moneyInt = (int) (money* 100);
        return new Money(moneyInt);
    }


    /**
     * this method will compute the sales tax of the total cost of a cart 
     * @param amount amount will be the money object of a cart. ex , $6.00, $9.00,$8.00
     * @return Will return a money object of the total mn sales tax
     */
    public static Money computeMNSalesTax(Money amount) {            
        String total = amount.toString();
        String modified = total.replace("$", "");
        double calculate = Double.parseDouble(modified);
        double cost = calculate;
        double salesTax = 0.06875;
        int convert = (int) Math.round(salesTax * cost * 100);

        return new Money(convert);

    }

    /**
     * this method will add to money objects together 
     * @param other is a money obeject, ex, $6.00, $9.00, $8.00
     * @return will return a money object that is the addition of both of them 
     */
    public Money add(Money other) {
        int total;
        total=this.amountinCents + other.amountinCents;
        return new Money(total);
    }

    /**
     * this method will subtract to money objects together 
     * @param other is a money obeject, ex, $6.00, $9.00, $8.00
     * @return will return a money object that is the subtracted of both of them 
     */
    public Money subtract(Money other) {
        int total;
        total = this.amountinCents - other.amountinCents;
        return new Money(total);
    }

    /**
     *this method will return the string version of the money object
     */
    public String toString() {    
        int dollar = amountinCents/100;
        int cents = amountinCents%100;
        String printMoney = "$" + dollar + ".";
        if (cents == 0) {
            return printMoney + cents + 0; // 9.00 works
        } else if (cents < 10 ){
            return printMoney  + 0 +  cents;     //  9.04
        } else { 
            return printMoney +  cents ;
        }




    }





}
