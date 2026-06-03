import java.util.regex.*;

public class PhoneExtraction {

    public static void main(String[] args) {

        String text = "Call Rahul on 9876543210 and Anushka on 8765432109";

        Pattern p = Pattern.compile("[6-9]\\d{9}");

        Matcher m = p.matcher(text);

        while(m.find())
        {
            System.out.println(m.group());
        }
    }
}