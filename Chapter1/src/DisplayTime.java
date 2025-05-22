import java.util.Scanner;

public class DisplayTime {
    public static void main (String[] args) {
        {
            int minutes, seconds;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter seconds: ");
            seconds = input.nextInt();
            minutes = seconds / 60;
            seconds = seconds % 60;

            System.out.println("The time is " + minutes + " minutes and " + seconds + " seconds.");
        }


    }
}
