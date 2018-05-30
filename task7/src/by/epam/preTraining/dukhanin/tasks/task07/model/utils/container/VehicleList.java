package by.epam.preTraining.dukhanin.tasks.task07.model.utils.container;

import by.epam.preTraining.dukhanin.tasks.task07.model.entities.Vehicle;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VehicleList {
    private Vehicle[] vehicles;
    private int size;

    public VehicleList() {
        vehicles = new Vehicle[size];
    }

    public VehicleList(Vehicle[] vehicles) {
        this.vehicles = vehicles;
        size = vehicles.length;
    }

    @Override
    public String toString() {
        return "VehicleList{" +
                Arrays.toString(vehicles) +
                '}';
    }

    public void add(Vehicle... newVehicles) {
        int oldSize = size;
        size += newVehicles.length;
        vehicles = Arrays.copyOf(vehicles, size);

        for (int i = 0; i < newVehicles.length; i++) {
            vehicles[oldSize + i] = newVehicles[i];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Vehicle get(int index) {
        rangeCheck(index);
        return vehicles[index];
    }

    public int size() {
        return size;
    }

    public boolean contains(Vehicle vehicle) {
        if (vehicle == null) {
            for (int i = 0; i < size; i++)
                if (vehicles[i] == null)
                    return true;
        } else {
            for (int i = 0; i < size; i++)
                if (vehicle.equals(vehicles[i]))
                    return true;
        }
        return false;
    }

    public boolean containsAll(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            if (contains(v) == false) {
                return false;
            }
        }
        return true;
    }

    public void remove(int index) {
        rangeCheck(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(vehicles, index + 1, vehicles, index,
                    numMoved);
        }
        vehicles[--size] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            vehicles[i] = null;
        }
        size = 0;
    }

    public Vehicle[] toArray() {
        return vehicles;
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }


}
