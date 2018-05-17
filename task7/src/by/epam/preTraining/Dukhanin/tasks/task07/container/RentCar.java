package by.epam.preTraining.Dukhanin.tasks.task07.container;

import by.epam.preTraining.Dukhanin.tasks.task07.entities.PassengerCar;
import by.epam.preTraining.Dukhanin.tasks.task07.entities.Vehicle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RentCar {
    private PassengerCar passengerCars[];

    public PassengerCar[] getPassengerCars() {
        return passengerCars;
    }

    public void setPassengerCars(PassengerCar[] passengerCars) {
        this.passengerCars = passengerCars;
    }

    public void addPassengerCar(PassengerCar passengerCar) {
        passengerCars = Arrays.copyOf(passengerCars, passengerCars.length + 1);
        passengerCars[passengerCars.length - 1] = passengerCar;
    }
}
