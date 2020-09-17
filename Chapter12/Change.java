import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        String dollar;
        String quarter;
        String dime;
        String nickel;
        String penny;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cents are due?");
        int cents = scan.nextInt();
            for (int x = cents; x >= 100; x = x - 100) {
                dollars++;
                cents = cents - 100;
            }
            for (int x = cents; x >= 25; x = x - 25) {
                quarters++;
                cents = cents - 25;
            }
            for (int x = cents; x >= 10; x = x - 10) {
                dimes++;
                cents = cents - 10;
            }
            for (int x = cents; x >= 5; x = x - 5) {
                nickels++;
                cents = cents - 5;
            }
            for (int x = cents; x >= 1; x = x - 1) {
                pennies++;
                cents = cents - 1;
            }
        if (dollars != 1) {
            dollar = " dollars";
        } else {
            dollar = " dollar";
        }
        if (quarters != 1) {
            quarter = " quarters";
        } else {
            quarter = " quarter";
        }
        if (dimes != 1) {
            dime = " dimes";
        } else {
            dime = " dime";
        }
        if (nickels != 1) {
            nickel = " nickels";
        } else {
            nickel = " nickel";
        }
        if (pennies != 1) {
            penny = " pennies";
        } else {
            penny = " penny";
        }
        System.out.println("Your change is: "+dollars+dollar+", "+quarters+quarter+", "+dimes+dime+", "+nickels+nickel+", and "+pennies+penny);
    }
}