import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        int sun = dailyTemp("Sunday", a);
        int mon = dailyTemp("Monday", a);
        int tue = dailyTemp("Tuesday", a);
        int wed = dailyTemp("Wednesday", a);
        int thu = dailyTemp("Thursday", a);
        int fri = dailyTemp("Friday", a);
        int sat = dailyTemp("Saturday", a);
        

        a.close();

        System.out.println("------------------------ \n Sunday: " + sun + " degrees F \n Monday: " + mon + " degrees F \n Tuesday: " + tue + " degrees F \n Wednesday: " + wed + " degrees F \n Thursday: " + thu + " degrees F \n Friday: " + fri + " degrees F \n Saturday: " + sat + " degrees F \n ------------------------");
    }

    public static int dailyTemp(String day, Scanner scanner) {
        System.out.println("What was the temperature on " + day + "?");
        int temp = scanner.nextInt();
        return temp;
    }
}