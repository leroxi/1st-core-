public class Manager extends Sotrydnik {
    private String hobby;
    public Manager(String name, int vozrast, int id, char dopysk, String hobby) {
        super(name, vozrast, id, dopysk);
        this.hobby = hobby;
    }
    Manager vova = new Manager("Vova", 19, 1,  'A', "Football");

}
