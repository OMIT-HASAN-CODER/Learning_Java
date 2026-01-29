package Chapter_05;

class Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    public  void changeCadence(int newValue) {
        cadence = newValue;
    }

    public  void changeGear(int newValue) {
        gear = newValue;
    }

    public  void speedUp(int increment) {
        speed = speed + increment;
    }

    public  void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("cadence: " + cadence + " speed: " + speed + " gear: " + gear);
    }
}

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.speedUp(20);
        bike1.changeGear(2);
        bike1.applyBrakes(10);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(20);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.applyBrakes(10);
        bike2.printStates();
    }
}
