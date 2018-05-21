package by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities;


import java.math.BigDecimal;

public class Car extends AbstractVehicle {
    public final static String VEHICLE_TYPE = "Car";
    private int numberOfSeats;
    private int trunkSpace;

    public Car() {
        super.setVehicleType(VEHICLE_TYPE);
    }

    public Car(long id, String model, int yearModel, String color, BigDecimal price, BigDecimal dailyPrice, int numberOfSeats, int trunkSpace) {
        super(id, model, yearModel, color, price, dailyPrice);
        super.setVehicleType(VEHICLE_TYPE);
        this.numberOfSeats = numberOfSeats;
        this.trunkSpace = trunkSpace;
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
