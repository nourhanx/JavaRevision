import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchDemo {
    public static void main (String[] args) {
        int integer;
        boolean continueInput = true;
        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.println("Please enter an integer: ");
                integer = input.nextInt();
                System.out.println("The integer you entered is " + integer);
                continueInput = false;
            } catch (InputMismatchException e) {
                System.out.println("You didn't enter an integer, please enter an integer.");
                input.nextLine();
            }
        } while (continueInput);
    }
}
