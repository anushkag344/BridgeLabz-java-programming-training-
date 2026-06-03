import java.util.Scanner;

public class PasswordChec {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String regex =
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";

        if(password.matches(regex))
        {
            System.out.println("Strong Password");
        }
        else
        {
            System.out.println("Weak Password");
        }
        sc.close();
        
    }
}