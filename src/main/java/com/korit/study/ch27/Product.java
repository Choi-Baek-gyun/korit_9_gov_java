package com.korit.study.ch27;

import com.korit.study.ch23.NonGeneric;

public class Product {
    private String name;
    private Integer price;
    private String size;

    public Product() {
    }

    public Product(String name, Integer price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public static ProductBuilder Builder() {
        return new ProductBuilder();
    }
    public static class ProductBuilder {
        private String name;
        private Integer price;
        private String size;

        public ProductBuilder name(String name) {
            this.name = name;
            return this;
        }
        public ProductBuilder price(Integer price) {
            this.price = price;
            return this;
        }
        public ProductBuilder size(String size) {
            this.size = size;
            return this;
        }

        public Product build() {
            return new Product(name, price, size);
        }
    }
}

