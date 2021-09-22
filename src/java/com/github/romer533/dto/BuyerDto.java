package java.romer533.dto;

public class BuyerDto {

    private final String name;
    private final int age;

    private int money = 500;

    public BuyerDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setMoney(int amount) {
        this.money = money + amount;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
