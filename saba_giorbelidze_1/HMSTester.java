package quizes.q3.saba_giorbelidze_1;
import java.util.*;

public class HMSTester {
    public static void main(String[] args) {
    HotelManager hms = new HotelManager();


    Room room101 = new Room(101);
    Room room102 = new Room(102);

    Person person1 = new Person();
    person1.setId("2468013579");
    person1.setName("Noah");
    person1.setSurname("Patel");

    Person person2 = new Person();
    person2.setId("0146802468");
    person2.setName("Saba");
    person2.setSurname("Giorbelidze");


    hms.checkIn(person1.getId(), room101);
    hms.checkIn(person2.getId(), room102);


    hms.displayInfo();
}
}