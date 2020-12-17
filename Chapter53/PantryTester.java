import java.util.Scanner;

public class PantryTester
{
  public static void main ( String[] args )
  {
    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    String type = "";

    int select = 0, spread;

    Pantry hubbard = new Pantry( goose, apple, rhub );

    Scanner scan = new Scanner(System.in);

    while (select != -1) {
    System.out.println("Welcome to Mother Hubbard's Pantry!\n\nThe jams are:\n" + hubbard + "Enter your selection (1, 2, or 3):");

    select = scan.nextInt();
    if (select == 1) {
        type = "Gooseberry";
        hubbard.select(1);
    } else if (select == 2) {
        type = "Crab Apple";
        hubbard.select(2);
    } else if (select == 3) {
        type = "Rhubarb";
        hubbard.select(3);
    } else if (select == -1) {
        System.out.println("Good-by");
        System.exit(0);
    }

    System.out.println("Enter amount to spread:");
    spread = scan.nextInt();

    System.out.println("Spreading " + spread + "ounces of " + type);
    }
  }
}