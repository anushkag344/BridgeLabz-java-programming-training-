import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.print("Enter second number: ");
        double num2 = Double.parseDouble(sc.nextLine());

        double add = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;

        System.out.println("Results: " + add + ", " + sub + ", " + mul + ", " + div);

        sc.close();
    }
}