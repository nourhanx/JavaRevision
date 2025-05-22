public class TestPassObject {
    public static void main (String[] args) {
        CirclePrivate c = new CirclePrivate(3);
        printAreas(c, 5);
    }

    public static void printAreas (CirclePrivate c, int times) {
        System.out.println("Radius\t\tArea");
        for (int i = 0; i < times; i++) {
            System.out.println(c.getRadius() + "\t\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
        }
    }
}
