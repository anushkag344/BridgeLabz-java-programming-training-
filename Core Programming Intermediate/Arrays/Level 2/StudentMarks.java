import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Physics: ");
            phy[i] = sc.nextInt();

            System.out.print("Chemistry: ");
            chem[i] = sc.nextInt();

            System.out.print("Maths: ");
            math[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percent[i] >= 90)
                grade[i] = "A";
            else if (percent[i] >= 75)
                grade[i] = "B";
            else
                grade[i] = "C";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }
        sc.close();
    }
}