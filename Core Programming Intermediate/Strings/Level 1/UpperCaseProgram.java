import java.util.Scanner;

public class UpperCaseProgram {

    public static String toUpperCustom(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                ch = (char)(ch - 32);

            result += ch;
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String custom = toUpperCustom(str);
        String builtIn = str.toUpperCase();
        sc.close();

        System.out.println("Same: " + compare(custom, builtIn));
    }
}