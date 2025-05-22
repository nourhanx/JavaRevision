public class SimpleCircle {
    double radius;

    SimpleCircle() {
    }

    SimpleCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

}
