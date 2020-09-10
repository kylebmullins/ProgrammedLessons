public class Trig {
    public static void main(String[] args) {
        double w = 30 * Math.PI/180;
        double x = Math.sin(w);
        double y = Math.cos(w);
        double z = (y * y) + (x * x);
        System.out.println(x+ ", " + y + ", " + z);
    }
}