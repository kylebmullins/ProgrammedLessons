public class Box {

    private double width, height, length;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double side) {
        this.width = side;
        this.height = side;
        this.length = side;
    }

    public double width() {
        return width;
    }

    public double height() {
        return height;
    }

    public double length() {
        return length;
    }

    public Box(Box oldbox) {
        this.width = oldbox.width();
        this.height = oldbox.height();
        this.length = oldbox.length();
    }

    public Box biggerBox( Box oldBox )
    {

     return new Box( .75*oldBox.width(), .75*oldBox.height(), .75*oldBox.length());
    }

    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    private double faceArea() {
        return width * height;
    }

    private double topArea() {
        return length * width;
    }

    private double sideArea() {
        return length * height;
    }

    public double volume() {
        return length*width*height;
    }

    public boolean nests( Box outsideBox ) {
        if (this.width < outsideBox.width && this.height < outsideBox.height && this.length < outsideBox.length) {
            return true;
        }
        return false;
        
    }
}