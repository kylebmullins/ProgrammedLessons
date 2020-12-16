import java.util.Random;

public class Character {
    int strength;
    int toughness;
    int intelligence;
    int magic;
    int influence;
    String name;
    String type;
    Random rand = new Random();

    public Character(String type) {
            this.type = type;
            randomize();
    }

    public void randomize() {
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
}