package com.github.romer533;

import com.github.romer533.domain.Shop;

public class Main {
    public static void main(String[] args) {

        Shop shop = createShop();

        System.out.println("Example simple shop: ");
        System.out.println("Products: " + shop.getProducts());
        System.out.println("Buyers: " + shop.getBuyers());
        System.out.println("Discounts: " + shop.getDiscounts());

    }

    private static Shop createShop() {
        Shop shop = new Shop();
        return shop;
    }

}
