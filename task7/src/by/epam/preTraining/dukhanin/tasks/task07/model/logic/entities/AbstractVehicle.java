package by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities;

import java.math.BigDecimal;


public abstract class AbstractVehicle {
    private long id;
    private String vehicleType;
    private String model;
    private int yearModel;
    private String color;
    private BigDecimal price;
    private BigDecimal dailyPrice;

    public AbstractVehicle() {
    }

    public AbstractVehicle(long id, String model, int yearModel, String color, BigDecimal price, BigDecimal dailyPrice) {
        this.id = id;
        this.model = model;
        this.yearModel = yearModel;
        this.color = color;
        this.price = price;
        this.dailyPrice = dailyPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }
}
