package Tests;

public class Accommodation {
    private String name;
    private String services;
    private double monthlyRent;

    public Accommodation(String name, String services, double monthlyRent) {
        this.name = name;
        this.services = services;
        this.monthlyRent = monthlyRent;
    }

    public String getName() {
        return name;
    }

    // Other getter and setter methods for services and monthlyRent can be added here, if needed
}
