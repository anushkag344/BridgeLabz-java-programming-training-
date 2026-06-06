import java.util.LinkedList;
import java.util.Queue;

public class TicketCounter {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Anushka");
        queue.add("Rahul");
        queue.add("Priya");
        queue.add("Aman");

        System.out.println("People waiting in queue: " + queue);

        while (!queue.isEmpty()) {
            String person = queue.poll();
            System.out.println(person + " got the ticket");
        }

        System.out.println("Queue is empty now");
    }
}