package com.korit.study.ch27;

public class BuilderMain {
    public static void main(String[] args) {
        BuilderStudy builderStudy = new BuilderStudy("김준일", 32);
        BuilderStudy builderStudy1 = BuilderStudy.builder()
                .value1("김준일")
                .value2(32)
                .build();

        Product product = Product.Builder().name("상품1").price(1000).size("L").build();
        System.out.println(product);

        // Computer computer = Computer.builder().build();
        ComputerBuilder computerBuilder = Computer.builder();
        computerBuilder.setCpu("i7");
        computerBuilder.setRam(8);
        Computer computer = computerBuilder.build();

        ComputerBuilder computerBuilder2 = Computer.builder().cpu("i5").ram(16);
        Computer computer2 = computerBuilder2.cpu("i7").build();

        System.out.println(computer);
        System.out.println(computer2);
    }
}
