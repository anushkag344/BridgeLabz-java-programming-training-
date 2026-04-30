import java.util.Scanner;

public class PurchaseTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double price = Double.parseDouble(sc.nextLine());

        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());

        double total = price * quantity;

        System.out.println("The total purchase price is INR " + total +
                " if the quantity " + quantity +
                " and unit price is INR " + price);

        sc.close();
    }
}