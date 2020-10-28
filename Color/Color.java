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
        if (red > 255) {
            red = 255;
        } else if (red < 0) {
            red = 0;
        } else if (grn > 255) {
            grn = 255;
        } else if (grn < 0) {
            grn = 0;
        } else if (blu > 255) {
            blu = 255;
        } else if (red < 0) {
            blu = 0;
        }
        r = red;
        g = grn;
        b = blu;
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
        if (x > 255) {
            x = 255;
        } if (x < 0) {
            x = 0;
        }
        r = x;
    }

    public void g(int x) {
        if (x > 255) {
            x = 255;
        } if (x < 0) {
            x = 0;
        }
        g = x;
    }

    public void b(int x) {
        if (x > 255) {
            x = 255;
        } if (x < 0) {
            x = 0;
        }
        b = x;
    }
}