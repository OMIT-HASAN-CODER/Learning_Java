package Chapter_06.Bike;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBreak(int decrement) {
        speed += decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }
}
