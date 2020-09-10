import java.util.Scanner;
public class Temp {
    public static void main(String[] args) {
        System.out.println("What was Sunday's temperature?");
        Scanner a = new Scanner(System.in);
        int sun =  a.nextInt();
        System.out.println("What was Monday's temperature?");
        Scanner b = new Scanner(System.in);
        int mon = b.nextInt();
        System.out.println("What was Tuesday's temperature?");
        Scanner c = new Scanner(System.in);
        int tue = c.nextInt();
        System.out.println("What was Wednesday's temperature?");
        Scanner d = new Scanner(System.in);
        int wed = d.nextInt();
        System.out.println("What was Thursday's temperature?");
        Scanner e = new Scanner(System.in);
        int thu = e.nextInt();
        System.out.println("What was Friday's temperature?");
        Scanner f = new Scanner(System.in);
        int fri = f.nextInt();
        System.out.println("What was Saturday's temperature?");
        Scanner g = new Scanner(System.in);
        int sat = g.nextInt();
        System.out.println("------------------------ \n Sunday: " + sun + " degrees F \n Monday: " + mon + " degrees F \n Tuesday: " + tue + " degrees F \n Wednesday: " + wed + " degrees F \n Thursday: " + thu + " degrees F \n Friday: " + fri + " degrees F \n Saturday: " + sat + " degrees F \n ------------------------");
    }
}