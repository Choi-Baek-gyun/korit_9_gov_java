package com.korit.study.ch19;

import java.sql.NClob;
import java.util.Scanner;

public class 최상위클래스 {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        Object c = a;
        Object d = b;
        Object e = "test";
        String f = "abc";
        Car car = new Car("k3", "white");
        System.out.println(car);
        Object g = car;
        String h = car.toString();
//        System.out.println(c + d);
        String name1 = "김준일";
        String name2 = "김준일";
        boolean result1 = name1 == name2;
        System.out.println(result1);
        String name3 = new String("김준일");
        System.out.println(name3);
        Scanner scanner = new Scanner(System.in);
        String name4 = scanner.nextLine();
        System.out.println(name4);
        boolean result2 = name1.equals(name3);
        System.out.println(result2);
        boolean result3 = name2 == name4;
        System.out.println(result3);
    }
}
