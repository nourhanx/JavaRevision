public class InvalidRadiusException extends Exception{
    private double radius;
    InvalidRadiusException(double r) {
        super("Invalid radius " + r + ". Radius should be greater than or equal to 0.");
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
}
