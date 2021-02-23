package hotel.management;

public class Hotel {
    private Room[][] rooms;
    public Hotel(){
        rooms = new Room[3][10];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                }else if (i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"双人间",true);
                }else if (i == 2){
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",true);
                }
            }
        }
    }
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
        }
    }
    public void order(int roomNunber){
        Room room = rooms[roomNunber / 100 - 1][roomNunber % 100 - 1];
        room.setFree(false);
        System.out.println(roomNunber+"已定房");
    }
    public void exit (int roomNunber){
        Room room = rooms[roomNunber / 100 - 1][roomNunber % 100 - 1];
        room.setFree(true);
        System.out.println(roomNunber+"已退房");
    }
}
