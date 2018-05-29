package by.epam.preTraining.dukhanin.tasks.task07.model.logic.utils.container;

import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.AbstractVehicle;

import java.util.Arrays;


public class DequeVehicle {
    private AbstractVehicle[] vehicles;
    private int size;

    public DequeVehicle() {
        this.vehicles = new AbstractVehicle[0];
    }

    public void push(AbstractVehicle vehicle) {
        vehicles = Arrays.copyOf(vehicles, ++size);
        vehicles[size - 1] = vehicle;
    }

    public AbstractVehicle pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("stack is empty");
        }
        AbstractVehicle vehicle = vehicles[--size];
        vehicles[size] = null;
        return vehicle;
    }

    public int peek() {
        return size;
    }


}
