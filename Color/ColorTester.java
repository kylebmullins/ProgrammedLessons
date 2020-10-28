
public class ColorTester {
    public static void main(String[] args) {
        Color test = new Color(1, 5, 244);
        test.summary();
        test.lighten(100);
        test.summary();
        test.darken(50);
        test.summary();
        test.randomize();
        test.summary();
    }
}