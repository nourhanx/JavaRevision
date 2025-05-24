public class CircleWithException {
    double radius;

    CircleWithException(){
        radius = 1;
    }

    CircleWithException(double r) throws InvalidRadiusException{
        if (r < 0) {
            throw new InvalidRadiusException(r);
        }
        radius = r;
    }

    void printCircle() {
        System.out.println("Circle with radius " + radius);
    }
}
