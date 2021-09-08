package com.github.romer533.domain;

import com.github.romer533.dto.BuyerDto;
import com.github.romer533.dto.DiscountDto;
import com.github.romer533.dto.ProductDto;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ProductDto> products = new ArrayList<>();
    private ArrayList<BuyerDto> buyers = new ArrayList<>();
    private ArrayList<DiscountDto> discounts = new ArrayList<>();

    public Shop(ArrayList<ProductDto> products, ArrayList<BuyerDto> buyers) {
        this.products = products;
        this.buyers = buyers;
    }

    public Shop(ArrayList<ProductDto> products, ArrayList<BuyerDto> buyers, ArrayList<DiscountDto> discounts) {
        this.products = products;
        this.buyers = buyers;
        this.discounts = discounts;
    }

    public ArrayList<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ProductDto> products) {
        this.products = products;
    }

    public ArrayList<BuyerDto> getBuyers() {
        return buyers;
    }

    public void setBuyers(ArrayList<BuyerDto> buyers) {
        this.buyers = buyers;
    }

    public ArrayList<DiscountDto> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(ArrayList<DiscountDto> discounts) {
        this.discounts = discounts;
    }

}
