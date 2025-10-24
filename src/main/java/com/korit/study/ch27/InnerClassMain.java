package com.korit.study.ch27;


public class InnerClassMain {
    public static void main(String[] args) {
        User user = new User("test1234", "1234");
        System.out.println(user);

        User.UserPrinter userPrinter = user.new UserPrinter(user.toString());  // 내부 클래스는 user 내부에서 생성해야 함
        User.UserPrinter2 userPrinter2 = new User.UserPrinter2(user.toString()); // static으로 생성 시 그냥 생성하면 됨
    }

}
