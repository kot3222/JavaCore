package classes;

import java.util.Arrays;

public class House {
    private boolean isCleaner;
    private String type;
    private Room[] rooms;

    public House(boolean isCleaner, String type, Room[] rooms) {
        this.isCleaner = isCleaner;
        this.type = type;
        this.rooms = rooms;
    }

    public boolean isCleaner() {

        return isCleaner;
    }

    public void setCleaner(boolean cleaner) {

        isCleaner = cleaner;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "isCleaner=" + isCleaner +
                ", type='" + type + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
