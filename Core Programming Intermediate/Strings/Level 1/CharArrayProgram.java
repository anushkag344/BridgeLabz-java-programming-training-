import java.util.Scanner;

public class CharArrayProgram {

    public static char[] toCharArrayCustom(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] custom = toCharArrayCustom(str);
        char[] builtIn = str.toCharArray();

        System.out.println("Same: " + compareArrays(custom, builtIn));
        sc.close();
    }
}