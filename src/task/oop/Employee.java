package task.oop;
public abstract class Employee {
    private String name;
    private int age;
    private char accessLevel;
    private int id;

    public Employee(String name, int age, int id, char accessLevel) {
        this.name = name;
        this.age = age;
        this.id = (int) (Math.random() * 6);
        this.accessLevel = accessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.out.println("Не корректное имя ");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int vozrast) {
        if (vozrast < 18) {
            System.out.println("Не корректный возраст ");
        } else if (vozrast > 100) {
            System.out.println("Не корректный возраст ");
        } else {
            this.age = age;
        }
    }

    public char getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevelchar() {
        this.accessLevel = accessLevel;
    }

    public int getId() {
        return id;
    }
}

