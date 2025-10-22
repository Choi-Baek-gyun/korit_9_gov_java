package com.korit.study.ch23;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = num; // autoBox
//        Integer num3 = new Integer(10);
        int num4 = num2;    // autoUnBoxing
        String numStr = Integer.toString(num);
        String numStr2 = num2.toString();
        String numStr3 = "" + num;

    }
}
