package by.epam.preTraining.dukhanin.tasks.task07.model.entities;

import java.math.BigDecimal;
import java.util.Objects;

public class Truck extends Vehicle {
    private int payload;
    private String typeDriverLicense;


    public Truck(long id, String model, int yearModel, String color, BigDecimal price, BigDecimal dailyPrice, int payload, String typeDriverLicense) {
        super(id, model, yearModel, color, price, dailyPrice);
        this.payload = payload;
        this.typeDriverLicense = typeDriverLicense;
    }

    public Truck(Truck truck) {
        this(truck.id, truck.model, truck.yearModel, truck.color, truck.price, truck.dailyPrice, truck.payload, truck.typeDriverLicense);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return payload == truck.payload &&
                Objects.equals(typeDriverLicense, truck.typeDriverLicense);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), payload, typeDriverLicense);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                ", typeDriverLicense='" + typeDriverLicense + '\'' +
                ", id=" + id +
                ", model='" + model + '\'' +
                ", yearModel=" + yearModel +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", dailyPrice=" + dailyPrice +
                '}';
    }

    public int getPayload() {

        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public String getTypeDriverLicense() {
        return typeDriverLicense;
    }

    public void setTypeDriverLicense(String typeDriverLicense) {
        this.typeDriverLicense = typeDriverLicense;
    }
}
