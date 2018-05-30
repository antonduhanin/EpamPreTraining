package by.epam.preTraining.dukhanin.tasks.task07.model.utils.container;

import by.epam.preTraining.dukhanin.tasks.task07.model.entities.Vehicle;

import java.util.Arrays;

public class QueueVehicle {
    private Vehicle[] vehicles;
    private int size;

    public QueueVehicle() {
        vehicles = new Vehicle[0];
    }

    public QueueVehicle(QueueVehicle queueVehicle) {
        vehicles = queueVehicle.vehicles;
        size = queueVehicle.size;
    }

    @Override
    public String toString() {
        return "QueueVehicle{" + Arrays.toString(vehicles) +
                '}';
    }

    public void insert(Vehicle vehicle) {
        Vehicle[] newVehicles = new Vehicle[++size];
        System.arraycopy(vehicles, 0, newVehicles, 1, size - 1);
        newVehicles[0] = vehicle;
        vehicles = newVehicles;

    }

    public Vehicle remove() {
        if (size == 0) {
            return null;
        }
        Vehicle vehicle = vehicles[size - 1];
        vehicles[--size] = null;
        return vehicle;
    }
}
