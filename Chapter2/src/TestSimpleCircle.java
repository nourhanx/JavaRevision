import java.util.Scanner;

public class TestSimpleCircle {
    public static void main(String[] args) {
        double radius;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        radius = input.nextDouble();

        SimpleCircle circle1= new SimpleCircle(radius);
        System.out.println("The circle of radius " + circle1.radius + " has an area = " + circle1.getArea());
    }
}
