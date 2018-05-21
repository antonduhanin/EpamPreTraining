package by.epam.preTraining.dukhanin.tasks.task07.model.logic.services;


import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.AbstractVehicle;
import by.epam.preTraining.dukhanin.tasks.task07.model.logic.utils.container.VehicleList;

import java.math.BigDecimal;

public class VehicleService {

    public void findVehiclesYoungerThan(VehicleList vehicleList, int yearModel) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getYearModel() < yearModel) {
                vehicleList.remove(i);
            }
        }
    }

    public BigDecimal findTotalPrice(VehicleList vehicleList) {
        BigDecimal price = new BigDecimal(0);
        for (int i = 0; i < vehicleList.size(); i++) {
            price = price.add(vehicleList.get(i).getPrice());
        }
        return price;
    }

    public AbstractVehicle findVehicleByColor(VehicleList vehicleList, String color) {
        AbstractVehicle vehicle = null;
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getColor().equals(color)) {
                vehicle = vehicleList.get(i);
            }
        }
        return vehicle;
    }
}
