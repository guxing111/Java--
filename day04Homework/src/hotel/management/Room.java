package hotel.management;

import java.util.Objects;

public class Room {
    private int number;
    private String type;
    private boolean free;

    public Room() {
    }

    public Room(int number, String type, boolean free) {
        this.number = number;
        this.type = type;
        this.free = free;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return number == room.number &&
                free == room.free &&
                Objects.equals(type, room.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, free);
    }

    @Override
    public String toString() {
        return "[" + number +
                ", '" + type + '\'' +
                ", " +(free ? "空闲" : "占用") +
                "]";
    }

   /*
   public static void main(String[] args) {
        Room room = new Room(101,"单人间",false);
        Room room1 = new Room(102,"双人间",true);
        System.out.println(room.toString());
        System.out.println(room1.toString());
    }
    */
}
