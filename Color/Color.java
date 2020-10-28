import java.util.Random;

public class Color {
    int r = 0;
    int g = 0;
    int b = 0;
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
        Random rand = new Random();
        r = rand.nextInt(256);
        g = rand.nextInt(256);
        b = rand.nextInt(256);
    }

    public void lighten(double percent) {
        if (percent >= 0) {
        double p = (percent + 100);
        r = r*(int)p/100;
        g = g*(int)p/100;
        b = b*(int)p/100;
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
            System.out.println("Error: ");
        }
    }

    public void darken(double percent) {
        if (percent >= 0 && percent <= 100) {
            r =r - (r*(int)percent/100);
            g =g - (g*(int)percent/100);
            b =b - (b*(int)percent/100);
            if (r < 0) {
                r = 0;
            }
            if (g < 0) {
                g = 0;
            }
            if (b < 0) {
                b = 0;
            }
        }
    }
}