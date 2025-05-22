public class CirclePrivate {
    private double radius;
    private static int numberOfObjects = 0;

    CirclePrivate() {
        radius = 1;
        numberOfObjects++;
    }
    CirclePrivate(double r) {
        radius = r;
        numberOfObjects++;
    }
    double getRadius(){
        return this.radius;
    }
    void setRadius(double r) {
        this.radius = r;
    }
    static int getNumberOfObjects() {
        return numberOfObjects;
    }
    double getArea() {
        return 3.14 * this.radius * this.radius;
    }

    static CirclePrivate[] createArray(double[] r) {
        CirclePrivate[] c = new CirclePrivate[r.length];
        for (int i = 0; i < r.length; i++) {
            c[i] = new CirclePrivate(r[i]);
        }
        return c;
    }
}
