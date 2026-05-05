import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            sc.close();
            return;
        }

        int sumLoop = 0;
        int i = 1;

        while (i <= n) {
            sumLoop += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop = " + sumLoop);
        System.out.println("Sum using formula = " + sumFormula);

        if (sumLoop == sumFormula) {
            System.out.println("Both results are correct!");
        } else {
            System.out.println("Mismatch in results!");
        }
        sc.close();
    }
}