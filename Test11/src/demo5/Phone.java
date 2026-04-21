package demo5;

import java.util.Comparator;

public class Phone{
    public String brand;
    public int price;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return brand +" : "+ price;
    }
}
