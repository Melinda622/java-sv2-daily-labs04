package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    Passenger passenger = new Passenger("John", "87312873", 3);
    private List<Passenger> passengers = new ArrayList<>();
    private int maxCapacity;

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public boolean addPassenger(Passenger passenger) {
        if (getPassengers().size() < getMaxCapacity()) {
            getPassengers().add(passenger);
            return true;
        }
        return false;
    }

    public int numberOfPackages() {
        int sum = 0;
        for (int i = 0; i < passengers.size(); i++) {
            sum += passengers.get(i).getNumberOfPackage();
        }
        return sum;
    }
}
