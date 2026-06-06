import java.util.Stack;

public class BrowserNavigation {
    public static void main(String[] args) {

        Stack<String> backStack = new Stack<>();
        Stack<String> forwardStack = new Stack<>();

        String currentPage = "Google";

        System.out.println("Current Page: " + currentPage);

        // Visit new page
        backStack.push(currentPage);
        currentPage = "YouTube";
        forwardStack.clear();
        System.out.println("Current Page: " + currentPage);

        // Visit another page
        backStack.push(currentPage);
        currentPage = "GitHub";
        forwardStack.clear();
        System.out.println("Current Page: " + currentPage);

        // Back button
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("After Back: " + currentPage);

        // Forward button
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("After Forward: " + currentPage);
    }
}