package Tests;


public class HousingUnit {
    private String location;
    private String services;
    private double monthlyRent;

    public HousingUnit(String location, String services, double monthlyRent) {
        this.location = location;
        this.services = services;
        this.monthlyRent = monthlyRent;
    }

    public String getLocation() {
        return location;
    }

    public String getServices() {
        return services;
    }

    public double getMonthlyRent() {
        return monthlyRent;
    }

    // Getters and setters (or lombok annotations) for the HousingUnit properties
}

