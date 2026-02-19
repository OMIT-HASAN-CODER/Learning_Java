package Chapter_05;

class Flight {
    private static final int TOTAL_SEATING_CAPACITY = 150;
    private int totalCheckedBags;
    private int totalPassengers;

    public void addOnePassenger(int bags, int carryOns) {
        int totalBags = bags;
        if (carryOns > 2) {
            totalBags = bags + carryOns - 2;
        }
        addOnePassenger(totalBags);
    }

    public void addOnePassenger(int bags) {
        if (isSeatAvailable()) {
            addOnePassenger();
            totalCheckedBags += bags;
        }
    }

    private boolean isSeatAvailable() {
        return totalCheckedBags < TOTAL_SEATING_CAPACITY;
    }

    public void addOnePassenger() {
        if (isSeatAvailable()) {
            totalPassengers += 1;
        }
    }

    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }
}

public class FlightDemo {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.addOnePassenger();
        flight.addOnePassenger(2);
        flight.addOnePassenger(2, 2);
        int totalCheckedBags = flight.getTotalCheckedBags();
        System.out.println("Total Checked Bags = " + totalCheckedBags);
        int totalPassengers = flight.getTotalPassengers();
        System.out.println("Total Passengers = " + totalPassengers);
    }
}
