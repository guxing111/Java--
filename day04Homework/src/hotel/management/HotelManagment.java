package hotel.management;

import java.util.Scanner;

public class HotelManagment {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下使用说明");
        System.out.println("功能编号对应的功能：[1]表示查看房间列表。[2]表示订房。[3]表示退房。[0]表示退出系统。");
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("请输入功能编号");
            int i = s.nextInt();
            if (i == 1){
                hotel.print();
            }else if (i == 2){
                System.out.println("请输入订房编号：");
                int roomNumber = s.nextInt();
                hotel.order(roomNumber);
            }else if (i == 3){
                System.out.println("请输入退房编号：");
                int roomNunmber = s.nextInt();
                hotel.exit(roomNunmber);
            }else if (i == 0){
                System.out.println("欢迎下次光临!!!");
                return;
            }else{
                System.out.println("输入的编号有错误");
            }
        }
    }
}
