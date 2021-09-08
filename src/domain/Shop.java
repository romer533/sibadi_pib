package domain;

import dto.BuyerDto;
import dto.DiscountDto;
import dto.ProductDto;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ProductDto> products = new ArrayList<ProductDto>();
    private ArrayList<BuyerDto> buyers = new ArrayList<BuyerDto>();
    private ArrayList<DiscountDto> discounts = new ArrayList<DiscountDto>();

    private void defaultProducts() {
        this.products.add(new ProductDto("milk", 65, 5));
        this.products.add(new ProductDto("bread", 30, 4));
        this.products.add(new ProductDto("chips", 100, 3));
    }

    private void defaultBuyers() {
        this.buyers.add(new BuyerDto("Raynur", 21));
        this.buyers.add(new BuyerDto("Yuriy", 30));
        this.buyers.add(new BuyerDto("Roman", 21, 1000));
    }

    public Shop() {
        defaultProducts();
        defaultBuyers();
    }

    public Shop(ArrayList<ProductDto> products) {
        this.products = products;
        defaultBuyers();
    }

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
        products.stream().map(v -> v.toString());
        return products;
    }

    public void addProduct(ProductDto product) {
        this.products.add(product);
    }

    public ArrayList<BuyerDto> getBuyers() {
        return buyers;
    }

    public void addBuyer(BuyerDto buyer) {
        this.buyers.add(buyer);
    }

    public ArrayList<DiscountDto> getDiscounts() {
        return discounts;
    }

    public void addDiscount(DiscountDto discount) {
        this.discounts.add(discount);
    }

}
