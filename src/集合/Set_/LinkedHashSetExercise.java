package 集合.Set_;/*
 *@author yang
 */

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class LinkedHashSetExercise {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new Car("yang",30000));
        set.add(new Car("yang",30000));
        set.add(new Car("yg",30300));
        set.add(new Car("yag",30000));
        System.out.println(set);
    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
