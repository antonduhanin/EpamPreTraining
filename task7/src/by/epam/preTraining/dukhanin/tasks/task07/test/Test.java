package by.epam.preTraining.dukhanin.tasks.task07.test;


import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.AbstractVehicle;
import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.Car;
import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.RentOrder;
import by.epam.preTraining.dukhanin.tasks.task07.model.logic.entities.Truck;
import by.epam.preTraining.dukhanin.tasks.task07.model.logic.services.VehicleService;
import by.epam.preTraining.dukhanin.tasks.task07.model.logic.utils.container.VehicleList;

import java.math.BigDecimal;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Car car = new Car(1, "sierra", 1998, "red", new BigDecimal(460), new BigDecimal(4), 4, 190);
        Truck truck = new Truck(2, "ford", 2010, "blue", new BigDecimal(1999), new BigDecimal(38), 5, "type C");

        AbstractVehicle[] vehicles = {car, truck};

        //test container
        VehicleList vehicleList = new VehicleList();
        vehicleList.add(vehicles);

        System.out.println("size of vehicle list: " + vehicleList.size());
        System.out.println("is empty? " + vehicleList.isEmpty());
        vehicleList.clear();
        System.out.println("is empty, after clear? " + vehicleList.isEmpty());
        vehicleList.add(car);
        vehicleList.add(truck);
        System.out.println("contains truck and car? " + vehicleList.containsAll(vehicles));
        System.out.println();


        //test service
        VehicleService service = new VehicleService();

        // test total price
        System.out.println("total price: " + service.findTotalPrice(vehicleList).toString());

        //test find findVehiclesYoungerThan
        service.findVehiclesYoungerThan(vehicleList, 2000);
        for (int i = 0; i < vehicleList.size(); i++) {
            System.out.println("year model of vehicle: " + vehicleList.get(i).getYearModel());
        }

        vehicleList.add(car);

        //test find findVehiclesByColor
        service.findVehicleByColor(vehicleList, "red");
        for (int i = 0; i < vehicleList.size(); i++) {
            System.out.println("color of vehicle: " + vehicleList.get(i).getColor());
        }

        //test rent order
        RentOrder rentOrder = new RentOrder(1, car, new Date(), new Date(), new BigDecimal(12), new BigDecimal(0));


    }
}
