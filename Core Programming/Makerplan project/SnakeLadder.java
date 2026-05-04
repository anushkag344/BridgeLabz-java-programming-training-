import java.util.Scanner;

public class SnakeLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int position = 0;

        while (position < 100) {
            System.out.print("Enter dice (1-6): ");
            int dice = sc.nextInt();

            // move forward
            position += dice;

            // check ladder
            if (position == 8) position = 26;
            else if (position == 21) position = 82;
            else if (position == 50) position = 91;

            // check snake
            else if (position == 99) position = 5;
            else if (position == 70) position = 55;
            else if (position == 25) position = 2;

            // if exceeds 100
            if (position > 100) {
                position -= dice;
            }

            System.out.println("Current Position: " + position);
        }

        System.out.println("🎉 You won!");
        sc.close();
    }
}