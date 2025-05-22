public class TotalArea {
    public static void main (String[] args) {
        double[] r = {1,2,3,4,5};
        CirclePrivate[] c = CirclePrivate.createArray(r);
        printAreaArray(c);
        System.out.println("Sum\t\t\t" + areaSum(c));
    }

    public static void printAreaArray (CirclePrivate[] c) {
        System.out.println("Radius\t\tArea");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i].getRadius() + "\t\t\t" + c[i].getArea());
        }
    }

    public static double areaSum (CirclePrivate[] c) {
        double sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i].getArea();
        }
        return sum;
    }
}
