import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Medieval {
    static int knight = 0;
    static int peasant = 0;
    static int cleric = 0;
    static int mage = 0;
    static int courtier = 0;
    static Scanner fileString;
    static Scanner fileInt;
    
    public static void main(String[] args) throws IOException {
        menu();
    }

    public static void menu() throws IOException, FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        int option = 0;
        System.out.println(clear() + "Welcome to Medieval Times, an exciting new turn based, multi-party rpg! Form a band of 4 medieval themed characters and journey through the land on a quest to rid the kingdom of evil monsters and men!\n\n\n\t\t\tInput number option:\n\n\t(1): Create new game\t\t(2): Validate Save File\n\n\t(3): Reroll Character\t\t(4): Quit\n\n\n\n\n");
        while (option < 1 || option > 4) {
        option = scan.nextInt();
        }
        if (option == 1) {
            newGame();
        } else if (option == 2) {
            Scanner file = new Scanner(System.in);
            System.out.println(clear() + "Please input a name of a file to validate:");
            String fileName = file.nextLine();
            validate(fileName);
        } else if (option == 3) {
            Scanner roll = new Scanner(System.in);
            System.out.println("Name a save file to reroll:");
            String save = roll.nextLine();
            System.out.println("Name a character file to reroll:");
            String character = roll.nextLine();
            reroll(save, character);
        } else if (option == 4) {
            System.out.println("Thanks for Playing!");
            System.exit(0);
        }

    }

    public static String clear() {
        return "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
    }

    public static void newGame() throws IOException {
        Scanner scan = new Scanner(System.in);
        String name;
        PrintWriter game;
        knight = 0;
        peasant = 0;
        cleric = 0;
        mage = 0;
        courtier = 0;

        System.out.println(clear() + "Name of the save file?");
        name = scan.nextLine();

        Character One = new Character(characterInit("One"));
        Character Two = new Character(characterInit("Two"));
        Character Three = new Character(characterInit("Three"));
        Character Four = new Character(characterInit("Four"));

        characterMaker(One, "One");
        characterMaker(Two, "Two");
        characterMaker(Three, "Three");
        characterMaker(Four, "Four");

        game = new PrintWriter(name + ".md");
        game.println(name + "\n" + characterPrint(One) + "\n" + characterPrint(Two) + "\n" + characterPrint(Three) + "\n" + characterPrint(Four));
        game.flush();
        game.close();
        menu();
    }

    public static void validate(String fileName) throws IOException, FileNotFoundException {
        int textCount = 0;
        File file = new File (fileName + ".md");
        Scanner fileScan = new Scanner(file);
        Scanner text = new Scanner(System.in);
        String valid;
        fileScan.useDelimiter(",|\\n");
        while (fileScan.hasNext()) {
            textCount++;
            valid = fileScan.next();
        }
        if (textCount == 29) {
            System.out.println("\n" + fileName + ".md IS valid! Input anything to go back to the menu.");
            String wait = text.next();
            menu();
        }
        System.out.println("\n" + fileName + ".md is NOT valid. Input anything to go back to the menu.");
            String wait = text.next();
            menu();
    }

    public static void reroll(String fileName, String character) throws IOException, FileNotFoundException {
        File file = new File (fileName + ".md");
        Scanner fileScan = new Scanner(file);
        Scanner text = new Scanner(System.in);
        String findName = "";
        String type;
        PrintWriter game = new PrintWriter(fileName + ".md");
        int strength;
        int toughness;
        int intelligence;
        int magic;
        int influence;
        int count = 0;
        StringBuilder write = new StringBuilder(findName);
        Random rand = new Random();
        fileScan.useDelimiter(",|\\n");
        while (fileScan.hasNext()) {
            if (!fileScan.next().equals(character)) {
                findName = fileScan.next();
                write.append(findName);
                System.out.println(write);
                count++;
                if (count == 1 || (count - 1)/7 == 1 || (count - 1)/7 == 2 || (count - 1)/7 == 3 || (count - 1)/7 == 4) {
                    write.append("\n");
                } else {
                    write.append(",");
                }
            } else if (fileScan.next().equals(character)) {
                findName = fileScan.next();
                type = fileScan.next();
                write.append(findName + "," + type + ",");
                if (fileScan.nextInt() > 6) {
                    strength = rand.nextInt(3) + 7;
                } else {
                    strength = rand.nextInt(6);
                }
                count++;
                if (fileScan.nextInt() > 6) {
                    toughness = rand.nextInt(3) + 7;
                } else {
                    toughness = rand.nextInt(6);
                }
                count++;
                if (fileScan.nextInt() > 6) {
                    intelligence = rand.nextInt(3) + 7;
                } else {
                    intelligence = rand.nextInt(6);
                }
                count++;
                if (fileScan.nextInt() > 6) {
                    magic = rand.nextInt(3) + 7;
                } else {
                    magic = rand.nextInt(6);
                }
                count++;
                if (fileScan.nextInt() > 6) {
                    influence = rand.nextInt(3) + 7;
                } else {
                    influence = rand.nextInt(6);
                }
                count++;
                write.append("," + strength + "," + toughness + "," + intelligence + "," + magic + "," + influence);
            }
        }
        while (fileScan.hasNext()) {
            findName = fileScan.next();
                write.append(findName);
                count++;
                if (count == 1 || (count - 1)/7 == 1 || (count - 1)/7 == 2 || (count - 1)/7 == 3 || (count - 1)/7 == 4) {
                    write.append("\n");
                } else {
                    write.append(",");
                }
        }
        game.println(write);
    }

    public static String characterInit(String number) {
        Scanner scan = new Scanner(System.in);
        System.out.println(clear() + "Type of character number " + number + "? Options are: Knight, Peasant, Cleric, Mage, and Courtier. Please capitalize the first letter.");
            String character = scan.nextLine();

            if (character.equals("Knight")) {
                character = testType("Knight", knight);
                knight++;

            } else if (character.equals("Peasant")) {
                character = testType("Peasant", peasant);
                peasant++;

            } else if (character.equals("Cleric")) {
                character = testType("Cleric", cleric);
                cleric++;

            } else if (character.equals("Mage")) {
                character = testType("Mage", mage);
                mage++;

            } else if (character.equals("Courtier")) {
                character = testType("Courtier", courtier);
                courtier++;
            }
            return character;
    }

    public static String testType(String Type, int type) {
        Scanner scan = new Scanner(System.in);
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

    public static void characterMaker(Character character, String number) {
        Scanner scan = new Scanner(System.in);
        int yesno = 0;
        boolean accept = false;
        while (!accept) {
            character.randomize();
            System.out.println(clear() + "The stats of character number " + number + " are as follows:" + "\n\nType: " + character.type + "\nStrength: " + character.strength + "\nToughness: " + character.toughness + "\nIntelligence: " + character.intelligence + "\nMagic: " + character.magic + "\nInfluence: " + character.influence + "\n\nTo accept or reject this character, input the number for the corresponding option:\n\n(1): Accept\t\t(2): Reject");
            yesno = scan.nextInt();
            while (yesno < 1 || yesno > 2) {
                yesno = scan.nextInt();
            }
            if (yesno == 1) {
                accept = true;
                System.out.println("\nName this character: ");
                String name = scan.nextLine();
                character.name = name;
            } else if (yesno == 2) {
                accept = false;
            }
        }
    }

    public static String characterPrint(Character character) {
        return character.name + "," + character.type + "," + character.strength + "," + character.toughness + "," + character.intelligence + "," + character.magic + "," + character.influence;
    }
}