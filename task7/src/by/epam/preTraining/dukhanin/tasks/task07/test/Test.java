package by.epam.preTraining.dukhanin.tasks.task07.test;


import by.epam.preTraining.dukhanin.tasks.task07.model.entities.Vehicle;
import by.epam.preTraining.dukhanin.tasks.task07.model.entities.Car;
import by.epam.preTraining.dukhanin.tasks.task07.model.entities.RentOrder;
import by.epam.preTraining.dukhanin.tasks.task07.model.entities.Truck;
import by.epam.preTraining.dukhanin.tasks.task07.model.logic.services.VehicleService;
import by.epam.preTraining.dukhanin.tasks.task07.model.utils.container.VehicleList;

import java.math.BigDecimal;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Car car = new Car(1, "sierra", 1998, "red", new BigDecimal(460), new BigDecimal(4), 4, 190);
        Truck truck = new Truck(2, "ford", 2010, "blue", new BigDecimal(1999), new BigDecimal(38), 5, "type C");

        Vehicle[] vehicles = {car, truck};

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
        System.out.println("size after delete: " + vehicleList.size());
        vehicleList.add(vehicles[1]);
        System.out.println();

        //test entities
        Car copyCar = new Car(car);
        System.out.println("copy car: "+copyCar+"\n");
        //test service
        VehicleService service = new VehicleService();

        // test total price
        System.out.println("total price: " + service.findTotalPrice(vehicleList).toString() + "\n");

        //test find findVehiclesYoungerThan
        VehicleList youngCars = service.findVehiclesYoungerThan(vehicleList, 2000);
        System.out.println("vehicles younger than 2000 year model");
        System.out.println(youngCars + "\n");

        //test find findVehiclesByColor
        VehicleList vehicleListWithSameColor = service.findVehicleByColor(vehicleList, "red");
        System.out.println("vehicles with color of red");
        System.out.println(vehicleListWithSameColor + "\n");

        //test rent order
        RentOrder rentOrder = new RentOrder(1, vehicleList, new Date(), new Date(), new BigDecimal(12), new BigDecimal(0));


    }
}
