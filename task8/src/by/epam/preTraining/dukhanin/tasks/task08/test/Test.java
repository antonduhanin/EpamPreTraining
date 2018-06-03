package by.epam.preTraining.dukhanin.tasks.task08.test;


import by.epam.preTraining.dukhanin.tasks.task08.model.entities.Car;
import by.epam.preTraining.dukhanin.tasks.task08.model.entities.Truck;
import by.epam.preTraining.dukhanin.tasks.task08.model.utils.container.VehicleQueue;
import by.epam.preTraining.dukhanin.tasks.task08.model.utils.container.VehicleStack;

import java.math.BigDecimal;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {

        //test VehicleDeque
        System.out.println("test VehicleStack");
        VehicleStack stack = new VehicleStack();
        stack.push(new Car(1, "sierra", 2003, "red", new BigDecimal(460), new BigDecimal(3), 4, 180));
        stack.push(new Car(3, "sierra", 2003, "red", new BigDecimal(460), new BigDecimal(3), 4, 180));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("size: " + stack.getSize());
        System.out.println("is empty? " + stack.isEmpty());
        System.out.println(stack.pop());


        //test VehicleQueue
        System.out.println("\n" + "test QueueVehicle");
        VehicleQueue queueVehicle = new VehicleQueue();
        queueVehicle.enqueue(new Truck(1, "ford", 2010, "blue", new BigDecimal(1999), new BigDecimal(38), 5, "type C"));
        queueVehicle.enqueue(new Car(2, "sierra", 2003, "red", new BigDecimal(460), new BigDecimal(3), 4, 180));
        System.out.println(queueVehicle);
        System.out.println(queueVehicle.dequeue());
        System.out.println(queueVehicle.peek());
        System.out.println("size: " + queueVehicle.getSize());
        System.out.println("is empty? " + queueVehicle.isEmpty());
        System.out.println(queueVehicle.dequeue());


    }
}
