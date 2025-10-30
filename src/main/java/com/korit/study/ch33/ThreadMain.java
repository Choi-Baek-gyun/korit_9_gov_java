package com.korit.study.ch33;

import com.sun.source.tree.NewClassTree;

import java.sql.NClob;

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadMain {
    public static void main(String[] args) {

        /**
         * Thread(쓰레드)
         * 1. 싱글쓰레드 : 쓰레드 하나만 사용의 의미(main메서드 하나만 사용)
         * 2. 멀티쓰레드 : 쓰레드 두 개 이상 사용
         *
         */

        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("1번 반복문: " + i);
                counter.increment();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("2번 반복문: " + i);
                counter.increment();
            }
        });
        System.out.println("쓰레드 시작");

        thread1.start();
        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//            // 여기부터 Thread1과 Thread2가 종료될 때까지 기다려라
//            System.out.println(counter.getCount());
//            System.out.println("쓰레드 종료");
//        } catch (InterruptedException e) {
//
//        }


    }

}
