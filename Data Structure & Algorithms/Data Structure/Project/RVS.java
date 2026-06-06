package Project;
import java.util.Stack;

class RecentlyVisitedStations {

    public static void main(String[] args) {
        Stack<String> stations = new Stack<>();

        stations.push("Jhansi");
        stations.push("Noida");
        stations.push("Agra");

        System.out.println("Station History: " + stations);
        System.out.println("Removed Station: " + stations.pop());
        System.out.println("Updated History: " + stations);
    }
}