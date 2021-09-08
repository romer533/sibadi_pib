package com.github.romer533;

import com.github.romer533.domain.Shop;
import com.github.romer533.dto.BuyerDto;
import com.github.romer533.dto.ProductDto;
import com.github.romer533.service.ShopService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shop shop = createShop();

        new ShopService(shop);

    }

    private static Shop createShop() {
        System.out.println("Creating shop...");
        ArrayList<ProductDto> products = new ArrayList<>();
        products.add(new ProductDto("Milk", 65, 5));
        products.add(new ProductDto("Bread", 30, 4));
        products.add(new ProductDto("Chips", 100, 3));

        ArrayList<BuyerDto> buyers = new ArrayList<>();
        buyers.add(new BuyerDto("Roman", 21));
        buyers.add(new BuyerDto("Yuriy", 30));
        buyers.add(new BuyerDto("Misha", 21));

        Shop shop = new Shop(products, buyers);

        shop.randomDiscount(10);
        System.out.println("Shop created.");

        return shop;
    }

}
