package Project;
import java.util.LinkedList;
import java.util.Queue;

 class MetroBooking {

    public static void main(String[] args) {

        Queue<String> bookingQueue = new LinkedList<>();

        bookingQueue.add("Anushka");
        bookingQueue.add("Rahul");
        bookingQueue.add("Priya");

        System.out.println("Pending Queue: " + bookingQueue);

        System.out.println("Next Booking: " + bookingQueue.peek());

        System.out.println("Processed Booking: " + bookingQueue.remove());

        System.out.println("Remaining Queue: " + bookingQueue);
    }
}