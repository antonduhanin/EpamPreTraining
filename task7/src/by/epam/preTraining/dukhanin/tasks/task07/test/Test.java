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
        vehicleList.remove(1);
        System.out.println("size after delete: "+vehicleList.size());
        vehicleList.add(vehicles[1]);
        System.out.println();

        //test service
        VehicleService service = new VehicleService();

        // test total price
        System.out.println("total price: " + service.findTotalPrice(vehicleList).toString()+"\n");

        //test find findVehiclesYoungerThan
        VehicleList youngCars = service.findVehiclesYoungerThan(vehicleList, 2000);
        System.out.println("vehicles younger than 2000 year model");
        for (int i = 0; i < youngCars.size(); i++) {
            System.out.println("year model of vehicle: " + youngCars.get(i).getYearModel());
        }
        System.out.println();

        //test find findVehiclesByColor
        VehicleList vehicleListWithSameColor = service.findVehicleByColor(vehicleList, "red");
        System.out.println("vehicles with color of red");
        for (int i = 0; i < vehicleListWithSameColor.size(); i++) {
            System.out.println("color of vehicle: " + vehicleListWithSameColor.get(i).getColor());
        }

        //test rent order
        RentOrder rentOrder = new RentOrder(1, vehicleList, new Date(), new Date(), new BigDecimal(12), new BigDecimal(0));


    }
}
