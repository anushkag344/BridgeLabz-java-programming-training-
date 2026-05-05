import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100");
                    sc.close();
            return;
        }

        int i = 100;

        System.out.println("Multiples of " + number + " below 100:");

        while (i >= 1) {
            if (i % number == 0) {
                System.out.print(i + " ");
            }
            i--;

        }
        sc.close();
    }
}