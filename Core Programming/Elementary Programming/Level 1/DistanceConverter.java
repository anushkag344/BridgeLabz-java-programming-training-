import java.util.Scanner;

public class DistanceConverter {

    public static double convertKmToMiles(double km) {
        return km / 1.6;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double miles = convertKmToMiles(km);

        System.out.println("The total miles is " + miles +
        " mile for the given " + km + " km");

        input.close();
    }
}