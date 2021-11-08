package day04;

public class PlaneMain {
    public static void main(String[] args) {
        Plane plane = new Plane(3);

        plane.addPassenger(new Passenger("John", "473947", 3));
        plane.addPassenger(new Passenger("Jack", "276947", 2));
        plane.addPassenger(new Passenger("Joan", "273567", 4));

        plane.addPassenger(new Passenger("Jane", "2323567", 4));
        plane.addPassenger(new Passenger("Jane", "2323567", 4));

        System.out.println(plane.numberOfPackages());
    }
}
