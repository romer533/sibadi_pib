package com.github.romer533.dto;

public class BuyerDto {

    private final String name;
    private final int age;

    private int money = 500;

    public BuyerDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public BuyerDto(String name, int age, int money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
