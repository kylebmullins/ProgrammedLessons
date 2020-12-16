public class Cylinder {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return Math.PI * radius * radius * height;
    }

    public double volume() {
        return (Math.PI * radius * radius * 2) + (Math.PI * radius * height * 2);
    }
}