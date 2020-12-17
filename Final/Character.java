import java.util.Random;
import java.util.Scanner;

public class Character {
    private int strength,toughness,intelligence,magic,influence,yesno = 0,character = 0;
    private String name, type;
    private Random rand = new Random();
    private static int number = 0, knight = 0, peasant = 0, cleric = 0, mage = 0, courtier = 0;
    private Scanner scan = new Scanner(System.in);
    private Scanner text = new Scanner(System.in);
    private boolean accept = false;

    private void randomize() {
        int bounds = 0;
        while (bounds < 8 || bounds > 28) {
        if (type.equals("Knight")) {
            this.strength = rand.nextInt(3) + 7;
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);
            
        } else if (type.equals("Peasant")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(3) + 7;
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);

        } else if (type.equals("Cleric")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(3) + 7;
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(6);

        } else if (type.equals("Mage")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(3) + 7;
            this.influence = rand.nextInt(6);

        } else if (type.equals("Courtier")) {
            this.strength = rand.nextInt(6);
            this.toughness = rand.nextInt(6);
            this.intelligence = rand.nextInt(6);
            this.magic = rand.nextInt(6);
            this.influence = rand.nextInt(3) + 7;

        }
        bounds = this.strength + this.toughness + this.intelligence + this.magic + this.influence;
        }
    }

    private String clear() {
        return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    }

    public void characterMaker() {
        number++;
        if (number > 4) {
            number = 1;
        }
        if (knight + peasant + cleric + mage + courtier > 3) {
            knight = 0;
            peasant = 0;
            cleric = 0;
            mage = 0;
            courtier = 0;
        }
        while (!accept) {
            randomize();
            System.out.println(clear() + "The stats of character number " + number + " are as follows:" + "\n\nType: " + type + "\nStrength: " + strength + "\nToughness: " + toughness + "\nIntelligence: " + intelligence + "\nMagic: " + magic + "\nInfluence: " + influence + "\n\nTo accept or reject this character, input the number for the corresponding option:\n\n(1): Accept\t\t(2): Reject");
            yesno = scan.nextInt();
            while (yesno < 1 || yesno > 2) {
                yesno = scan.nextInt();
            }
            if (yesno == 1) {
                accept = true;
                System.out.println("\nName this character: ");
                name = text.nextLine();
            } else if (yesno == 2) {
                accept = false;
            }
        }
    }

    public Character() {
        number++;
        if (number > 4) {
            number = 1;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println(clear() + "Please select what type character number " + number + " should be:\n\n\t(1): Knight\t(2): Peasant\n\n(3): Cleric\t(4): Mage\t(5): Courtier");
            character = scan.nextInt();
            while (character < 1 || character > 5) {
                character = scan.nextInt();
            }
            if (character == 1) {
                type = testType("Knight", knight);
                knight++;

            } else if (character == 2) {
                type = testType("Peasant", peasant);
                peasant++;

            } else if (character == 3) {
                type = testType("Cleric", cleric);
                cleric++;

            } else if (character == 4) {
                type = testType("Mage", mage);
                mage++;

            } else if (character == 5) {
                type = testType("Courtier", courtier);
                courtier++;

            }
    }

    private String testType(String Type, int type) {
        if (type++ > 1) {
            String newType = Type;
            while (newType.equals(Type)) {
            System.out.println("\nYou already have too many characters of that type. Please try again using a different type.");
            newType = scan.nextLine();
            }
            return newType;
        } 
        return Type;
    }

    public String characterPrint() {
        return name + "," + type + "," + strength + "," + toughness + "," + intelligence + "," + magic + "," + influence;
    }
}