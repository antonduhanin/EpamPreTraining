package by.epam.preTraining.dukhanin.tasks.task07.model.logic.services;


import by.epam.preTraining.dukhanin.tasks.task07.model.logic.utils.container.VehicleList;

import java.math.BigDecimal;

public class VehicleService {

    public VehicleList findVehiclesYoungerThan(VehicleList vehicleList, int yearModel) {
        VehicleList youngCars = new VehicleList();
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getYearModel() >= yearModel) {
                youngCars.add(vehicleList.get(i));
            }
        }
        return youngCars;
    }

    public BigDecimal findTotalPrice(VehicleList vehicleList) {
        BigDecimal price = new BigDecimal(0);
        for (int i = 0; i < vehicleList.size(); i++) {
            price = price.add(vehicleList.get(i).getPrice());
        }
        return price;
    }

    public VehicleList findVehicleByColor(VehicleList vehicleList, String color) {
        VehicleList vehicleListWithSameColor = new VehicleList();
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getColor().equals(color)) {
                vehicleListWithSameColor.add(vehicleList.get(i));
            }
        }
        return vehicleListWithSameColor;
    }
}
