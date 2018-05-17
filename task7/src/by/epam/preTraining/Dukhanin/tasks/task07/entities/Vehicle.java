package by.epam.preTraining.Dukhanin.tasks.task07.entities;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Vehicle {
    private long id;
    private String brand;
    private BigDecimal price;
    private int age;

    public Vehicle(long id, String brand, BigDecimal price, int age) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id &&
                age == vehicle.age &&
                Objects.equals(brand, vehicle.brand) &&
                Objects.equals(price, vehicle.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, brand, price, age);
    }
}
