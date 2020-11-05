
public class ColorTester {
    public static void main(String[] args) {
        Color test = new Color(1, 5, 244);
        Color testTwo = new Color();
        test.getColor();
        test.lighten(100);
        test.getColor();
        test.darken(50);
        test.getColor();
        test.randomize();
        test.getColor();
        test.setRed(10);
        test.setGreen(20);
        test.setBlue(30);
        test.getColor();
        testTwo.getColor();
    }
}