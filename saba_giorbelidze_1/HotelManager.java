package quizes.q3.saba_giorbelidze_1;
import java.util.*;
public class HotelManager {
    private Map<String, Room> guests;

    public HotelManager() {
        this.guests = new HashMap<>();
    }

    public void checkIn(String personId, Room room) {
        guests.put(personId, room);
    }

    public void checkOut(String personId) {
        guests.remove(personId);
    }

    public void displayInfo() {
        System.out.println("Hotel Guests and Room Information:");
        for (Map.Entry<String, Room> entry : guests.entrySet()) {
            String personId = entry.getKey();
            Room room = entry.getValue();
            Person person = new Person();
            System.out.println("Person ID: " + personId + ", Room Number: " + room.getRoomNumber());
        }
    }
}