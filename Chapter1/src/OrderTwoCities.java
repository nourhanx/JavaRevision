import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        String cityA, cityB, greaterCity;
        int comparison;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the two cities");
        cityA = input.nextLine();
        cityB = input.nextLine();

        comparison = cityA.compareTo(cityB);

        if (comparison < 0) {
            greaterCity = cityB;
        } else if (comparison > 0) {
            greaterCity = cityA;
        } else {
            greaterCity = null;
        }

        if(greaterCity != null) {
            System.out.println("The greater city is " + greaterCity + ".");
        } else {
            System.out.println("They are both the same city!");
        }

    }
}
