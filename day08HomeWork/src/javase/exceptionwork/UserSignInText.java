package javase.exceptionwork;

import java.util.Scanner;

public class UserSignInText {
    public static void main(String[] args) {
        UserService userService = new UserService();

        try {
            userService.register("ZHangSan","123123123");
            //userService.register("sada","13123132132");
            //userService.register("abdiasbdjoabofjbaofj","1315361");

        } catch (MySignInException e) {
            e.printStackTrace();
        }

    }
}
