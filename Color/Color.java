import java.util.Random;

public class Color {
    Random rand = new Random();
    int r = 0;
    int g = 0;
    int b = 0;
    public Color(int red, int grn, int blu) {
        r = fitDomain(red);
        g = fitDomain(grn);
        b = fitDomain(blu);
    }

    public Color() {
        randomize();
    }

    public void getColor() {
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
            r = (int)((double)r*p/100.0);
            g = (int)((double)g*p/100.0);
            b = (int)((double)b*p/100.0);
            fitDomain();
        }
    }

    public void darken(double percent) {
        if (percent >= 0 && percent <= 100) {
            r = (int)(r - ((double)r*percent/100.0));
            g = (int)(g - ((double)g*percent/100.0));
            b = (int)(b - ((double)b*percent/100.0));
            fitDomain();
        }
    }

    public void setRed(int x) {
        r = fitDomain(x);
    }

    public void setGreen(int x) {
        g = fitDomain(x);
    }

    public void setBlue(int x) {
        b = fitDomain(x);
    }

    public int fitDomain(int x) {
        if (x > 255) {
            x = 255;
        } else if (x < 0) {
            x = 0;
        }
        return x;
    }

    public void fitDomain() {
        if (r > 255) {
            r = 255;
        } else if (r < 0) {
            r = 0;
        } else if (g > 255) {
            g = 255;
        } else if (g < 0) {
            g = 0;
        } else if (b > 255) {
            b = 255;
        } else if (b < 0) {
            b = 0;
        }
    }
}