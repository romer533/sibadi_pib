package dto;

public class ProductDto {

    private String name;
    private int price;
    private int number;

    public ProductDto(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        return "product={'" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
