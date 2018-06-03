package by.epam.preTraining.dukhanin.tasks.task09.model.logic.services;

import by.epam.preTraining.dukhanin.tasks.task09.model.entities.Truck;
import by.epam.preTraining.dukhanin.tasks.task09.model.entities.Vehicle;

public class VehicleSorter {

    public static void insertionSortByYearModel(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length - 1; i++) {
            for (int j = i + 1; j < vehicles.length; j++) {
                if (vehicles[i].getYearModel() < vehicles[j].getYearModel()) {
                    Vehicle temp = vehicles[i];
                    vehicles[i] = vehicles[j];
                    vehicles[j] = temp;
                }
            }
        }
    }

    public static void quickSortTrucksByPayload(Truck[] trucks, int low, int high) {
        int left = low, right = high;
        int pivot = trucks[(low+high) >>> 1].getPayload();
        while (left < right) {
            while (trucks[left].getPayload() < pivot) {
                left++;
            }
            while ((trucks[right].getPayload()>pivot)){
                right--;
            }
            if(left<=right){
                Truck temp = trucks[left];
                trucks[left] = trucks[right];
                trucks[right] = temp;
                left++;
                right--;
            }
        }

        //recursion on left and right of the pivot
        if (low<right){
            quickSortTrucksByPayload(trucks,low,right);
        }
        if(left<high){
            quickSortTrucksByPayload(trucks,left,high);
        }
    }

}
