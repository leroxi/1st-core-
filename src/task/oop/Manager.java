package task.oop;

public class Manager extends Employee {
    private String hobby;

    public Manager(String name, int age, int id, char accessLevel, String hobby) {
        super(name, age, id, accessLevel);
        this.hobby = hobby;
    }

    Manager vova = new Manager("Vova", 19, 1, 'A', "Football");

}
