package by.epam.preTraining.dukhanin.tasks.task07.model.entities;


import java.math.BigDecimal;
import java.util.Objects;

public class Car extends Vehicle {

    private int numberOfSeats;
    private int trunkSpace;

    public Car() {

    }

    public Car(long id, String model, int yearModel, String color, BigDecimal price, BigDecimal dailyPrice, int numberOfSeats, int trunkSpace) {
        super(id, model, yearModel, color, price, dailyPrice);
        this.numberOfSeats = numberOfSeats;
        this.trunkSpace = trunkSpace;
    }

    public Car(Car car) {
        this(car.id, car.model, car.yearModel, car.color, car.price, car.dailyPrice, car.numberOfSeats, car.trunkSpace);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfSeats == car.numberOfSeats &&
                trunkSpace == car.trunkSpace;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), numberOfSeats, trunkSpace);
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                ", trunkSpace=" + trunkSpace +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", yearModel=" + yearModel +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", dailyPrice=" + dailyPrice +
                '}';
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getTrunkSpace() {
        return trunkSpace;
    }

    public void setTrunkSpace(int trunkSpace) {
        this.trunkSpace = trunkSpace;
    }
}
