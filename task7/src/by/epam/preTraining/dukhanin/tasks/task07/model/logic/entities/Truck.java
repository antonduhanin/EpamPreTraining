package by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities;

import java.math.BigDecimal;
import java.util.Objects;

public class Truck extends AbstractVehicle {
    public final static String VEHICLE_TYPE = "Truck";
    private int payload;
    private String typeDriverLicense;

    public Truck() {
        super.setVehicleType(VEHICLE_TYPE);
    }

    public Truck(long id, String model, int yearModel, String color, BigDecimal price, BigDecimal dailyPrice, int payload, String typeDriverLicense) {
        super(id, model, yearModel, color, price, dailyPrice);
        super.setVehicleType(VEHICLE_TYPE);
        this.payload = payload;
        this.typeDriverLicense = typeDriverLicense;
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
                ", vehicleType='" + vehicleType + '\'' +
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
