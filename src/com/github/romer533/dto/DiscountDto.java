package com.github.romer533.dto;

public class DiscountDto {

    private final ProductDto product;
    private final int discountPercent;
    private final boolean isActive;

    public DiscountDto(ProductDto product, int discountPercent) {
        this.product = product;
        this.discountPercent = discountPercent;
        this.isActive = true;
    }

    public ProductDto getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "product=" + product +
                ", discountPercent=" + discountPercent +
                ", active=" + isActive +
                '}';
    }
}
