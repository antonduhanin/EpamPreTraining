package by.epam.preTraining.dukhanin.tasks.task07.model.logic.utils.container;

import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.AbstractVehicle;
import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.Car;

import java.math.BigDecimal;

public class QueueVehicle {
    private AbstractVehicle[] vehicles;
    private int size;

      public QueueVehicle() {
        vehicles = new AbstractVehicle[0];
    }

    public void insert(AbstractVehicle vehicle) {
        AbstractVehicle[] newVehicles = new AbstractVehicle[++size];
        System.arraycopy(vehicles, 0, newVehicles, 1, size - 1);
        newVehicles[0] = vehicle;
        vehicles = newVehicles;

    }

    public AbstractVehicle remove() {
        if (size == 0) {
           return null;
        }
        AbstractVehicle vehicle = vehicles[size - 1];
        vehicles[--size] = null;
        return vehicle;
    }
}
