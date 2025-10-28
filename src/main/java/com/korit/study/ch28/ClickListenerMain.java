package com.korit.study.ch28;

public class ClickListenerMain {
    public static void main(String[] args) {
        Button button = new Button();
        button.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭되었습니다!");
            }
        });
        button.click();
        ClickListener a = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("버튼이 클릭");
            }
        };
        button.setClickListener(a);
        button.click();

    }
}
