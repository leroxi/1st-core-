public class WarehouseWorker extends Sotrydnik {

    private int fingers;

    public WarehouseWorker(String name, int vozrast, int id, char dopysk, int fingers) {
        super(name, vozrast, id,  dopysk);
        this.fingers = fingers;
    }

    WarehouseWorker Alexa = new WarehouseWorker("Vasik", 15, 10,  'D', 19 );

}
