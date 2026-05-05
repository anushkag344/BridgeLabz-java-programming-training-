import java.util.Scanner;

public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageA = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        double hA = sc.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int ageB = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        double hB = sc.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int ageC = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        double hC = sc.nextDouble();

        // Youngest
        if (ageA < ageB && ageA < ageC) {
            System.out.println("Youngest: Amar");
        } else if (ageB < ageA && ageB < ageC) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }

        // Tallest
        if (hA > hB && hA > hC) {
            System.out.println("Tallest: Amar");
        } else if (hB > hA && hB > hC) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }
        sc.close();
    }

}