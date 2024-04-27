import java.util.Random;

public abstract class Sotrydnik {
    private String name;
    private int vozrast;
    private char dopysk;
    private int id;
    public Sotrydnik(String name, int vozrast, int id, char dopysk){
        this.name = name;
        this.vozrast = vozrast;
        this.id = (int) (Math.random() * 6);
        this.dopysk = dopysk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.out.println("Не корректное имя ");
        }
        else {
            this.name = name;
        }
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int vozrast) {
        if(vozrast < 18) {
            System.out.println("Не корректный возраст ");
        }
        else if(vozrast > 100) {
            System.out.println("Не корректный возраст ");
        }
        else {
            this.vozrast = vozrast;
        }
    }

    public char getDopysk() {
        return dopysk;
    }

    public void setDopysk(char dopysk) {
        this.dopysk = dopysk;
    }

    public int getId() {
        return id;
    }
}

