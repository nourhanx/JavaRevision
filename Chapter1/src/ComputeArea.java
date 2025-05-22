import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        final double PI = 3.14;
        double radius;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the radius: ");
        radius = input.nextDouble();
        area  = PI * radius * radius;

        System.out.println("The area for the circle of radius " + radius + " is: " + area);
    }
}
