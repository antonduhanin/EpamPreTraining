package by.epam.preTraining.dukhanin.tasks.task09.test;


import by.epam.preTraining.dukhanin.tasks.task09.model.entities.Vehicle;
import by.epam.preTraining.dukhanin.tasks.task09.model.entities.Car;
import by.epam.preTraining.dukhanin.tasks.task09.model.entities.RentOrder;
import by.epam.preTraining.dukhanin.tasks.task09.model.entities.Truck;
import by.epam.preTraining.dukhanin.tasks.task09.model.logic.services.VehicleSearcher;
import by.epam.preTraining.dukhanin.tasks.task09.model.logic.services.VehicleService;
import by.epam.preTraining.dukhanin.tasks.task09.model.logic.services.VehicleSorter;
import by.epam.preTraining.dukhanin.tasks.task09.model.utils.container.VehicleList;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Car car = new Car(1, "sierra", 1998, "red", new BigDecimal(460), new BigDecimal(4), 4, 190);
        Truck truck = new Truck(2, "ford", 2010, "blue", new BigDecimal(1999), new BigDecimal(38), 5, "type C");

        Vehicle[] vehicles = {car, truck, new Car(1, "sierra", 1986, "red", new BigDecimal(460), new BigDecimal(4), 4, 190)};

        //test sort
        System.out.println("sort by yearModel");
        System.out.println("before sort: " + Arrays.toString(vehicles));
        VehicleSorter.insertionSortByYearModel(vehicles);
        System.out.println("after sort: " + Arrays.toString(vehicles));

        System.out.println("sort by yearModel");
        Truck[] trucks = {truck, new Truck(3, "ford", 2010, "blue", new BigDecimal(1999), new BigDecimal(38), 23, "type C"),
                new Truck(4, "ford", 2010, "blue", new BigDecimal(1999), new BigDecimal(38), 15, "type C")};
        System.out.println("before sort: " + Arrays.toString(trucks));
        VehicleSorter.quickSortTrucksByPayload(trucks, 0, trucks.length - 1);
        System.out.println("after sort: " + Arrays.toString(trucks));

        //test search
        System.out.println("vehicle with id 2: " + VehicleSearcher.searchVehicleById(vehicles, 2));

        System.out.println("truck with payload 23: "+VehicleSearcher.binarySearchByPayload(trucks,23,0,trucks.length-1));
    }
}
