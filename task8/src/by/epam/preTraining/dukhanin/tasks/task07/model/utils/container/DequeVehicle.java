package by.epam.preTraining.dukhanin.tasks.task07.model.utils.container;

import by.epam.preTraining.dukhanin.tasks.task07.model.entities.Vehicle;

import java.util.Arrays;


public class DequeVehicle {
    private Vehicle[] vehicles;
    private int size;

    public DequeVehicle() {
        this.vehicles = new Vehicle[0];
    }

    public DequeVehicle(DequeVehicle dequeVehicle) {
        vehicles = dequeVehicle.vehicles;
        size = dequeVehicle.size;
    }

    @Override
    public String toString() {
        return "DequeVehicle{" +
                Arrays.toString(vehicles) +
                '}';
    }

    public void push(Vehicle vehicle) {
        vehicles = Arrays.copyOf(vehicles, ++size);
        vehicles[size - 1] = vehicle;
    }

    public Vehicle pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("stack is empty");
        }
        Vehicle vehicle = vehicles[--size];
        vehicles[size] = null;
        return vehicle;
    }

    public int peek() {
        return size;
    }


}
