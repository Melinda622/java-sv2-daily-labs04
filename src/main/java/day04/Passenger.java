package day04;

public class Passenger {
    private String name;
    private String code;
    private int numberOfPackage;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getNumberOfPackage() {
        return numberOfPackage;
    }

    public Passenger(String name, String code, int numberOfPackage) {
        this.name = name;
        this.code = code;
        this.numberOfPackage = numberOfPackage;
    }
}
