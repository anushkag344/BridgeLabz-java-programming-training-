import java.util.Scanner;

public class AthleteRun {

    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter; // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 sides: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("Rounds needed: " + rounds);
        sc.close();
    }
}