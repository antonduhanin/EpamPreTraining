package by.epam.preTraining.dukhanin.tasks.task07.test;


import by.epam.preTraining.dukhanin.tasks.task07.model.entities.Car;
import by.epam.preTraining.dukhanin.tasks.task07.model.entities.Truck;
import by.epam.preTraining.dukhanin.tasks.task07.model.utils.container.DequeVehicle;
import by.epam.preTraining.dukhanin.tasks.task07.model.utils.container.QueueVehicle;
import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {

        //test DequeVehicle
        System.out.println("test DequeVehicle");
        DequeVehicle dequeVehicle = new DequeVehicle();
        dequeVehicle.push(new Car(1, "sierra", 2003, "red", new BigDecimal(460), new BigDecimal(3), 4, 180));
        dequeVehicle.push(new Car(3, "sierra", 2003, "red", new BigDecimal(460), new BigDecimal(3), 4, 180));
        System.out.println(dequeVehicle);
        System.out.println(dequeVehicle.pop());
        System.out.println(dequeVehicle.peek());
        System.out.println(dequeVehicle.pop());


        //test DequeVehicle
        System.out.println("\n" + "test QueueVehicle");
        QueueVehicle queueVehicle = new QueueVehicle();
        queueVehicle.insert(new Truck(1, "ford", 2010, "blue", new BigDecimal(1999), new BigDecimal(38), 5, "type C"));
        queueVehicle.insert(new Car(2, "sierra", 2003, "red", new BigDecimal(460), new BigDecimal(3), 4, 180));
        System.out.println(queueVehicle);
        System.out.println(queueVehicle.remove());
        System.out.println(queueVehicle.remove());
    }
}
