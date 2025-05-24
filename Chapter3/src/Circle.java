public class Circle extends GeometricObject{
    private double radius;

    Circle() {
        radius = 1;
    }
    Circle(double r) {
        radius = r;
    }
    Circle(double r, String color, boolean filled ) {
        radius = r;
        setColor(color);
        setFilled(filled);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        this.radius = r;
    }

}
