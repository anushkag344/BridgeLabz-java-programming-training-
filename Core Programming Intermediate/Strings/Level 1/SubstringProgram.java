import java.util.Scanner;

public class SubstringProgram {

    public static String getSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String custom = getSubstring(str, start, end);
        String builtIn = str.substring(start, end);

        System.out.println("Custom: " + custom);
        System.out.println("Built-in: " + builtIn);
        System.out.println("Same: " + compare(custom, builtIn));
        sc.close();
    }
}