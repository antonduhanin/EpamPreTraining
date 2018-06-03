package by.epam.preTraining.dukhanin.tasks.task09.model.logic.services;

import by.epam.preTraining.dukhanin.tasks.task09.model.entities.Truck;
import by.epam.preTraining.dukhanin.tasks.task09.model.entities.Vehicle;

public class VehicleSearcher {

    public static Vehicle searchVehicleById(Vehicle[] vehicles, long id) {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i].getId() == id) {
                return vehicles[i];
            }
        }
        return null;
    }

    public static Truck binarySearchByPayload(Truck trucks[],  int payload,int low, int high) {
        int left = low, right = high;

        while (left <= right) {
            int mid = (low + high) >>> 1;
            Truck midVal = trucks[mid];

            if (midVal.getPayload() > payload) {
                return VehicleSearcher.binarySearchByPayload(trucks, payload, low, mid - 1);
            } else if (midVal.getPayload() < payload) {
                return VehicleSearcher.binarySearchByPayload(trucks, payload, mid + 1, high);
            } else {
                return trucks[mid];
            }
        }

        return null;
    }
}
