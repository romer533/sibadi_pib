package com.github.romer533.java.service;

import com.github.romer533.java.domain.Shop;
import com.github.romer533.java.dto.BuyerDto;
import com.github.romer533.java.dto.CheckDto;
import com.github.romer533.java.dto.ProductDto;
import com.github.romer533.java.dto.ReportDto;

import java.util.stream.Collectors;

public class ShopService {

    private final Shop shop;
    private final ReportDto report = new ReportDto();

    public ShopService(Shop shop) {
        System.out.println("The shop is open...");

        this.shop = shop;

        buyBread();
        buyMilk();
        buyChips();
        buyAll();

        System.out.println("The shop is close. \n" + this.report);
    }

    private void buyProduct(ProductDto product, BuyerDto buyer, int amount) {

        product.setNumber(amount);

        this.report.setAmountSealed(amount);
        this.report.setAmountEarned(product.getPrice() * amount);
        this.report.setCheck(new CheckDto(product.getName(), product.getPrice(), amount));

        buyer.setMoney(product.getPrice() * amount);

    }

    private void buyBread() {
        ProductDto bread = shop.getProducts().stream()
                .filter(product -> product.getName().equals("Bread"))
                .collect(Collectors.toList())
                .get(0);
        BuyerDto roman = shop.getBuyers().stream()
                .filter(buyer -> buyer.getName().equals("Roman"))
                .collect(Collectors.toList())
                .get(0);
        buyProduct(bread, roman, 2);
    }

    private void buyMilk() {
        ProductDto milk = shop.getProducts().stream()
                .filter(product -> product.getName().equals("Milk"))
                .collect(Collectors.toList())
                .get(0);
        BuyerDto yuriy = shop.getBuyers().stream()
                .filter(buyer -> buyer.getName().equals("Yuriy"))
                .collect(Collectors.toList())
                .get(0);
        buyProduct(milk, yuriy, 3);
    }

    private void buyChips() {
        ProductDto chips = shop.getProducts().stream()
                .filter(product -> product.getName().equals("Chips"))
                .collect(Collectors.toList())
                .get(0);
        BuyerDto yuriy = shop.getBuyers().stream()
                .filter(buyer -> buyer.getName().equals("Yuriy"))
                .collect(Collectors.toList())
                .get(0);
        buyProduct(chips, yuriy, 1);
    }

    private void buyAll() {

        ProductDto bread = shop.getProducts().stream()
                .filter(product -> product.getName().equals("Bread"))
                .collect(Collectors.toList())
                .get(0);
        ProductDto milk = shop.getProducts().stream()
                .filter(product -> product.getName().equals("Milk"))
                .collect(Collectors.toList())
                .get(0);
        ProductDto chips = shop.getProducts().stream()
                .filter(product -> product.getName().equals("Chips"))
                .collect(Collectors.toList())
                .get(0);

        BuyerDto roman = shop.getBuyers().stream()
                .filter(buyer -> buyer.getName().equals("Roman"))
                .collect(Collectors.toList())
                .get(0);

        buyProduct(milk, roman, 1);

        buyProduct(bread, roman, 1);

        buyProduct(chips, roman, 1);
    }

}
