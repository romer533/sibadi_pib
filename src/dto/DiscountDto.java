package dto;

public class DiscountDto {

    private final ProductDto product;
    private final int discountPercent;

    public DiscountDto(ProductDto product, int discountPercent) {
        this.product = product;
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "product=" + product +
                ", discountPercent=" + discountPercent +
                '}';
    }
}
