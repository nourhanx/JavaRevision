public class TestCirclePrivate {
    public static void main (String[] args) {
        double radius;
        double area;

        CirclePrivate c1 = new CirclePrivate(3);

        radius =  c1.getRadius();
        area = c1.getArea();

        System.out.println("The circle c1 has a radius " + radius + " and area " + area);
    }
}
