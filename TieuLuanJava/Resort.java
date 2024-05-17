import java.util.ArrayList;

public class Resort extends CommonAccommodation {
    /* Code here */
    protected int resortRanks;
    protected boolean isPools;
    protected Resort(int identifiCodeofLive, String place, String numberStreetName, String city, ArrayList rooms, int resortRanks, boolean isPools, float ranks) {
        super(identifiCodeofLive, place, numberStreetName, city, rooms, ranks);
        this.resortRanks = resortRanks;
        this.isPools = isPools;
    }
    protected Resort(int identifiCodeofLive, String place, String numberStreetName, String city, int resortRanks, boolean isPools, float ranks) {
        super(identifiCodeofLive, place, numberStreetName, city, ranks);
        this.resortRanks = resortRanks;
        this.isPools = isPools;
    }
@Override
    public String toString() {
        return "Resort [" + identifiCodeofLive + ", " + place + ", " + resortRanks + ", " + numberStreetName + ", " + isPools + ", " + city + "]";
    }
}
