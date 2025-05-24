import java.util.Scanner;

public class QuotientWithException {
    public static double quotient(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return number1 /number2;
    }

    public static void main(String[] args) {
        double number1, number2;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");
        number1 = input.nextInt();
        number2 = input.nextInt();

        try {
            result = quotient(number1, number2);
            System.out.println("The result of dividing " + number1 + " by " + number2 + " is " + result);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Execution continues..");
    }
}
