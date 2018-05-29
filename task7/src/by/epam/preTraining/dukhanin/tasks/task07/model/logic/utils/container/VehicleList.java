package by.epam.preTraining.dukhanin.tasks.task07.model.logic.utils.container;

import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.AbstractVehicle;

import java.util.Arrays;

public class VehicleList {
    private AbstractVehicle[] vehicles;
    private int size;

    public VehicleList() {
        vehicles = new AbstractVehicle[size];
    }

    public VehicleList(VehicleList rentList) {
        vehicles = rentList.vehicles;
    }

    public void add(AbstractVehicle... newAbstractVehicles) {
        int oldSize = size;
        size += newAbstractVehicles.length;
        vehicles = Arrays.copyOf(vehicles, size);

        for (int i = 0; i < newAbstractVehicles.length; i++) {
            vehicles[oldSize + i] = newAbstractVehicles[i];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public AbstractVehicle get(int index) {
        rangeCheck(index);
        return vehicles[index];
    }

    public int size() {
        return size;
    }

    public boolean contains(AbstractVehicle vehicle) {
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

    public boolean containsAll(AbstractVehicle[] vehicles) {
        for (AbstractVehicle v : vehicles) {
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

    public AbstractVehicle[] toArray(){
        return vehicles;
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException();
    }


}
