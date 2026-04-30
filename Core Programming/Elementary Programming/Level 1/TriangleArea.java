import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = Double.parseDouble(sc.nextLine());

        System.out.print("Enter height: ");
        double height = Double.parseDouble(sc.nextLine());

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / (2.54 * 2.54);

        System.out.println("Area in sq cm: " + areaCm +
                " and in sq inches: " + areaInches);

        sc.close();
    }
}