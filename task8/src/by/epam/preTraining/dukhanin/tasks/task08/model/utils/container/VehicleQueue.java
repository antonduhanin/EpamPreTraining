package by.epam.preTraining.dukhanin.tasks.task08.model.utils.container;

import by.epam.preTraining.dukhanin.tasks.task08.model.entities.Vehicle;

import java.util.Arrays;

public class VehicleQueue {
    private Vehicle[] vehicles;
    private int size;

    public VehicleQueue() {
        vehicles = new Vehicle[0];
    }

    public VehicleQueue(VehicleQueue VehicleDeque) {
        vehicles = VehicleDeque.vehicles;
        size = VehicleDeque.size;
    }

    @Override
    public String toString() {
        return "VehicleQueue{" + Arrays.toString(vehicles) +
                '}';
    }

    public void enqueue(Vehicle vehicle) {
        Vehicle[] newVehicles = new Vehicle[++size];
        System.arraycopy(vehicles, 0, newVehicles, 1, size - 1);
        newVehicles[0] = vehicle;
        vehicles = newVehicles;

    }

    public Vehicle dequeue() {
        checkSize();
        Vehicle vehicle = vehicles[size - 1];
        vehicles[--size] = null;
        return vehicle;
    }

    public Vehicle peek() {
        checkSize();
        return vehicles[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    private void checkSize() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
