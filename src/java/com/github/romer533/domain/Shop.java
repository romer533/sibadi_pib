package java.romer533.domain;

import java.romer533.dto.BuyerDto;
import java.romer533.dto.DiscountDto;
import java.romer533.dto.ProductDto;

import java.util.ArrayList;

public class Shop {

    private final ArrayList<ProductDto> products;
    private final ArrayList<BuyerDto> buyers;
    private final ArrayList<DiscountDto> discounts = new ArrayList<>();

    public Shop(ArrayList<ProductDto> products, ArrayList<BuyerDto> buyers) {
        this.products = products;
        this.buyers = buyers;
    }

    public void randomDiscount(int percent) {
        int length = this.products.size();
        int product = length / 2;
        if (!checkDiscount(product)) {
            this.discounts.add(new DiscountDto(this.products.get(product), percent));
            System.out.println("Today discount on: " + this.products.get(product));
        } else
            System.out.println("Discount already exists");
    }

    private boolean checkDiscount(int product) {
        return this.discounts.stream().anyMatch(v -> v.getProduct().equals(products.get(product)));
    }

    public ArrayList<ProductDto> getProducts() {
        return products;
    }

    public ArrayList<BuyerDto> getBuyers() {
        return buyers;
    }

}
