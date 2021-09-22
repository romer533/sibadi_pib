package java.romer533.dto;

public class ProductDto {

    private final String name;
    private final int price;

    private int number;

    public ProductDto(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setNumber(int number) {
        this.number = this.number - number;
    }

    @Override
    public String toString() {
        return "product={'" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
