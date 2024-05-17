import java.util.ArrayList;

public class Hotel extends CommonAccommodation {
    /* Code here */
    protected int hotelRanks;
    protected Hotel(int identifiCode, String place, String numberStreetName, String city, ArrayList rooms, int hotelRanks, float ranks) {
        super(identifiCode, place, numberStreetName, city, rooms, ranks);
        this.hotelRanks = hotelRanks;
    }
    protected Hotel(int identifiCode, String place, String numberStreetName, String city, int hotelRanks, float ranks) {
        super(identifiCode, place, numberStreetName, city, ranks);
        this.hotelRanks = hotelRanks;
    }
@Override
    public String toString() {
        return "Hotel [" + identifiCodeofLive + ", " + hotelRanks + ", " + place + ", " + numberStreetName + ", " + city + "]";
    }
}
