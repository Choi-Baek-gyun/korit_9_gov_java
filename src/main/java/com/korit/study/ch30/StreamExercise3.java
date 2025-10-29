package com.korit.study.ch30;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExercise3 {
    public static void main(String[] args) {


        class Item {
            String name;
            int stock;
            boolean onSale;
            int price;

            public Item(String name, int stock, boolean onSale, int price) {
                this.name = name;
                this.stock = stock;
                this.onSale = onSale;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public int getStock() {
                return stock;
            }

            public boolean isOnSale() {
                return onSale;
            }

            public int getPrice() {
                return price;
            }
        }

        List<Item> items = Arrays.asList(
                new Item("노트북", 5, true, 1000000),
                new Item("마우스", 0, true, 30000),
                new Item("키보드", 10, false, 50000),
                new Item("헤드셋", 3, true, 80000),
                new Item("웹캠", 0, false, 60000)
        );

        List<Item> filteringItems = items.stream()
                .filter(item -> item.stock > 0 && item.onSale)
                .toList();

        System.out.println(filteringItems);

        List<String> data = Arrays.asList("apple", null, "banana", "", null, "cherry", "");
        List<String> NotNullData = data.stream()
                .filter(n -> n != null)
                .toList();
        System.out.println(NotNullData);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 3, 6, 7, 5, 8);

        List<Integer> filteringNum = numbers.stream()
                .filter(num -> numbers.stream().filter(num2 -> num2 == num).count() == 1)
                .toList();

        System.out.println(filteringNum);

        List<Integer> filteringNumber2 = new ArrayList<>();
        for (Integer num : numbers) {
            int count = 0;
            for (Integer num2 : numbers) {
                if (num2 == num) {
                    count++;
                }
            }
            if (count == 1) {
                filteringNumber2.add(num);
            }
        }
        System.out.println(filteringNumber2);

        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2024, 1, 1),  // 월요일
                LocalDate.of(2024, 1, 6),  // 토요일
                LocalDate.of(2024, 1, 7),  // 일요일
                LocalDate.of(2024, 1, 10), // 수요일
                LocalDate.of(2024, 1, 13), // 토요일
                LocalDate.of(2024, 1, 14)  // 일요일
        );

        System.out.println(LocalDate.of(2024,01,01).getDayOfWeek()); // 요일을 꺼내오는 메서드

        List<LocalDate> filteringDates = dates.stream()
                .filter(localDate -> localDate.getDayOfWeek().name().equals("SATURDAY")
                        || localDate.getDayOfWeek().name().equals("SUNDAY"))
                .toList();

        System.out.println(filteringDates);


    }
}
