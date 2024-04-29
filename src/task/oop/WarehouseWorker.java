package task.oop;
public class WarehouseWorker extends Employee {

    private int fingers;

    public WarehouseWorker(String name, int age, int id, char accessLevel, int fingers) {
        super(name, age, id,  accessLevel);
        this.fingers = fingers;
    }

    WarehouseWorker Alexa = new WarehouseWorker("Vasik", 15, 10,  'D', 19 );

}
