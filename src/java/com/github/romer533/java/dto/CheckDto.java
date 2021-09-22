package com.github.romer533.java.dto;

public class CheckDto {

    private final String name;
    private final int price;
    private final int amount;

    public CheckDto(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "\n--- Check OOO\"SHOP\" ---\nThank you for choosing us\n{" +
                "product=" + name +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
