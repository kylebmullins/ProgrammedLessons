import java.util.Scanner;
public class Cost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cost per kilowatt-hour in cents:");
        double hours = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year:");
        double time = scan.nextDouble();
        double cost = (hours/100) * time;
        System.out.println("Annual cost: " + cost + " dollars.");
    }
}