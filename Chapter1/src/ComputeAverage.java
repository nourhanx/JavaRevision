import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        int n;
        double number, average;
        double sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number of numbers: ");
        n = input.nextInt();

        System.out.println("Please enter your numbers");

        for (int i = 0; i < n; i++) {
            number = input.nextDouble();
            sum = sum + number;
        }
        average = sum / n;

        System.out.println("The average is equal to " + average);
    }
}
