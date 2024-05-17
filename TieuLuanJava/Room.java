public class Room {
    /* Code here */
    private int identifiCode;
    private String roomName;
    private int numberofFloors;
    private String typeRoom;
    private int numberBed;
    private int maxiPeopleRoom;
    private double roomArea;
    private double priceperNight;
    public Room(int identifiCode, String roomName, int numberofFloors, String typeRoom, int numberBed, int maxiPeopleRoom, double roomArea, double priceperNight) {

    }
    public int getIdentifiCode() {
        return identifiCode;
    } 
    public void setIdentifiCode(int identifiCode) {
        this.identifiCode = identifiCode;
    }
    public String getRoomName() {
        return roomName;
    }
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
    public int getNumberoffFloors() {
        return numberofFloors;
    }
    public void setNumberoffFloors(int getNumberoffFloors) {
        this.numberofFloors = numberofFloors;
    }
    public String getTypeRoom() {
        return typeRoom;
    }
    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }
    public int getNumberBed() {
        return numberBed;
    }
    public void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }
    public int getMaxiPeopleRoom() {
        return maxiPeopleRoom;
    }
    public void setMaxiPeopleRoom(int maxiPeopleRoom) {
        this.maxiPeopleRoom = maxiPeopleRoom;
    }
    public double getRoomArea() {
        return roomArea;
    }
    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }
    public double getPriceperNinght() {
        return priceperNight;
    }
    public void setPriceperNinght(double priceperNight) {
        this.priceperNight = priceperNight;
    }
    public String toString() {
        return "Room [" + identifiCode + ", " + roomName + ", " + numberofFloors + ", " + typeRoom + ", " + ", " + numberBed + ", " + maxiPeopleRoom + ", " + roomArea + ", " + priceperNight + "]";
    }
}
