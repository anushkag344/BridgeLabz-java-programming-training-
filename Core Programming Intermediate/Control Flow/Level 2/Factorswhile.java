import java.util.Scanner;

public class Factorswhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Enter positive number");
                sc.close();
            return;
        }

        int i = 1;

        while (i < number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;

        }
        sc.close();
    }
}