package amount.in.pennies;
import java.util.Scanner;
public class AmountInPennies {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int cents = scnr.nextInt();
        
        if (cents <= 0)  {      
        System.out.println(" No change ");
         }
        else {
            int dollars = cents / 100;
            cents %= 100;
            int quarters = cents / 25;
            cents %= 25;
            int dimes = cents / 10;
            cents %= 10;
            int nickels = cents / 5;
            int pennies = cents % 5;
            
            if (dollars != 0)
                System.out.println( dollars + (dollars == 1 ? " dollars " : " Dollars "));
            if (quarters != 0)
                System.out.println( quarters + (quarters == 1 ? " Quarter " : " Quarters "));
            if (dimes != 0)
                System.out.println( dimes + (dimes == 1 ? " dime " : " Dimes "));
            if (nickels != 0)
                System.out.println( nickels + (nickels == 1 ? " Nickel " : " Nickels "));
            if (pennies != 0)
                System.out.println( pennies + (pennies == 1 ? " Penny " : " Pennies "));
        }
    }
}