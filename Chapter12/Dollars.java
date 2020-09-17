import java.util.Scanner;
public class Dollars {
    public static void main(String[] args) {
        int c;
        int dollar;
        int d;
        Scanner cents = new Scanner(System.in);
        System.out.println("Input the cents: ");
        c = cents.nextInt();
        dollar = testDollar(c);
        d = c - (100 * dollar);
        System.out.println("That is " + dollar + " dollars and " + d + " cents.");
    }

    public static int testDollar(int cent) {
        int y = 0;
        for(int x = cent/100; x>0;x--) {
            y++;
        }
        return y;
    }
}