package by.epam.preTraining.Dukhanin.tasks.task07.entities;

import java.math.BigDecimal;

public class PassengerCar extends Vehicle {
    private String bodyType;
    private Customer customer;


    public PassengerCar(long id, String brand, BigDecimal price, int age) {
        super(id, brand, price, age);
    }
}
