package by.epam.preTraining.dukhanin.tasks.task08.model.utils.container;

import by.epam.preTraining.dukhanin.tasks.task08.model.entities.Vehicle;

import java.util.Arrays;


public class VehicleStack {
    private Vehicle[] vehicles;
    private int size;

    public VehicleStack() {
        this.vehicles = new Vehicle[0];
    }

    public VehicleStack(VehicleStack VehicleStack) {
        vehicles = VehicleStack.vehicles;
        size = VehicleStack.size;
    }

    @Override
    public String toString() {
        return "VehicleStack{" +
                Arrays.toString(vehicles) +
                '}';
    }

    public void push(Vehicle vehicle) {
        vehicles = Arrays.copyOf(vehicles, ++size);
        vehicles[size - 1] = vehicle;
    }

    public Vehicle pop() {
        checkSize();
        Vehicle vehicle = vehicles[--size];
        vehicles[size] = null;
        return vehicle;
    }

    public Vehicle peek() {
        checkSize();
        return vehicles[size - 1];
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void checkSize() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("stack is empty");
        }
    }

}
