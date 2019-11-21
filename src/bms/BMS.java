package bms;

public class BMS {

    public static void main(String[] args) {
        connectionClass db = new connectionClass();
        try {
            db.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        db.close();
    }

}
