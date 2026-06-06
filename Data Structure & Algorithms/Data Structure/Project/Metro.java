package Project;

import java.util.HashMap;

class Metro {
    public static void main(String[] args) {
        HashMap<String, Integer> station = new HashMap<>();
        station.put("delhi", 120);
        station.put("jhansi", 85);

        System.out.println("Passenger Count:");
        System.out.println(station);

        System.out.println("delhi Passengers: "+ station.get("delhi"));

        if (station.get("delhi") > station.get("jhansi")) {

            System.out.println("Most Visited Station: delhi");

        } else {

            System.out.println("Most Visited Station: jhansi");
        }
    }
}