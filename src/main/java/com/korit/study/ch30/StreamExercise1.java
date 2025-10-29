package com.korit.study.ch30;

import java.util.Arrays;
import java.util.List;

public class StreamExercise1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie", "david");
        List<String> upperNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();
        System.out.println(upperNames);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbers2 = numbers.stream()
                .map(number -> number * number)
                .toList();
        System.out.println(numbers2);

        List<String> words = Arrays.asList("Java", "Stream", "API", "Programming");
        List<Integer> wordLen = words.stream()
                .map(len -> len.length())
                .toList();
        System.out.println(wordLen);

        List<Double> prices = Arrays.asList(100.0, 200.0, 150.0, 300.0);
        List<Double> taxPrice = prices.stream()
                .map(tax -> tax + tax * 0.1)
                .toList();
        System.out.println(taxPrice);

        class Person {
            private String name;
            private int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        List<String> peopleName = people.stream()
                .map(name -> name.getName())
                .toList();
        System.out.println(peopleName);

    }
}
