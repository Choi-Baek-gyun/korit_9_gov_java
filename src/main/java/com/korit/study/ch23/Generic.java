package com.korit.study.ch23;

public class Generic<T, T2> { // 자료형을 변수처럼 사용하고 싶다.
    private T data; // 대문자 1글자로 생성
    private T data2;
    private double data3;
    private T2 data4;
    private Integer[] arr;


    public Generic(T data, T data2, double data3, T2 data4) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        arr = new Integer[10];
    }
}
