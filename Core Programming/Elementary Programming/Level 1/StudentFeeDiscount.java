import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student Fee: ");
            double fee = sc.nextDouble();

            System.out.print("Enter Discount Percentage: ");
            double discountPercent = sc.nextDouble();

            double discount = (fee * discountPercent) / 100;
            double finalFee = fee - discount;

            System.out.println("The discount amount is INR " + discount +
                    " and final discounted fee is INR " + finalFee);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        }

        sc.close();
    }
}