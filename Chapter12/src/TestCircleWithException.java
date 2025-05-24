import java.util.Scanner;

public class TestCircleWithException {
    public static void main (String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        radius = input.nextDouble();

        try {
            CircleWithException c = new CircleWithException(radius);
            c.printCircle();
        } catch (InvalidRadiusException e) {
            System.out.println(e.getMessage());
        }

    }
}
