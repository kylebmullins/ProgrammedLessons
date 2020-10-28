import java.util.Random;

public class Color {
    Random rand = new Random();
    int r = 0;
    int g = 0;
    int b = 0;
    double rMath;
    double gMath;
    double bMath;
    public Color(int red, int grn, int blu) {
        if (0 <= red && red <= 255 && 0 <= grn && grn <= 255 && 0 <= blu && blu <= 255){
            r = red;
            g = grn;
            b = blu;
        } else {
            System.out.println("Error: 1 or more values does not fit in the range of 0-255. Please fix error and try again.");
        }
    }

    public Color() {
        randomize();
    }

    public void summary() {
        System.out.println("[" + r + ", " + g + ", " + b + "]");
    }

    public void randomize() {
        r = rand.nextInt(256);
        g = rand.nextInt(256);
        b = rand.nextInt(256);
    }

    public void lighten(double percent) {
        if (percent >= 0) {
            double p = (percent + 100);
            rMath = (double)r*p/100.0;
            gMath = (double)g*p/100.0;
            bMath = (double)b*p/100.0;
            r = (int)rMath;
            g = (int)gMath;
            b = (int)bMath;
            if (r > 255) {
                r = 255;
            }
            if (g > 255) {
                g = 255;
            }
            if (b > 255) {
                b = 255;
            }
        } else {
            System.out.println("Error: Percent value is not positive. Please fix and try again.");
        }
    }

    public void darken(double percent) {
        if (percent >= 0 && percent <= 100) {
            rMath = r - ((double)r*percent/100.0);
            gMath = g - ((double)g*percent/100.0);
            bMath = b - ((double)b*percent/100.0);
            r = (int)rMath;
            g = (int)gMath;
            b = (int)bMath;
            if (r < 0) {
                r = 0;
            }
            if (g < 0) {
                g = 0;
            }
            if (b < 0) {
                b = 0;
            }
        } else {
            System.out.println("Error: Percent value does not fit in the range 0-100. Please fix and try again.");
        }
    }

    public void r(int x) {
        r = x;
    }

    public void g(int x) {
        g = x;
    }

    public void b(int x) {
        b = x;
    }
}