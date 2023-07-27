// Package: Tests

package Tests;


import java.util.Scanner;

public class HousingDetailsApp {

    public static void main(String[] args) {
        // Create an instance of the HousingUnitManager to manage housing units
        HousingUnitManager housingUnitManager = new HousingUnitManager();

        // Sample housing units for demonstration purposes
        housingUnitManager.addHousingUnit(new HousingUnit("Rafidia Street, Nablus", "Furnished, Wi-Fi, Laundry", 150));
        housingUnitManager.addHousingUnit(new HousingUnit("Al-Manara, Ramallah", "Unfurnished, Parking", 120));
        housingUnitManager.addHousingUnit(new HousingUnit("Old City, Jerusalem", "Garden, 24/7 Security", 200));
        housingUnitManager.addHousingUnit(new HousingUnit("Downtown, Bethlehem", "Fully Furnished, Gym, Parking", 180));
        housingUnitManager.addHousingUnit(new HousingUnit("Green Valley, Hebron", "Swimming Pool, Wi-Fi, Balcony", 190));

        // Simulation of a user interacting with the application through the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Housing Details App!");
        System.out.println("Available housing units in Palestine:");

        housingUnitManager.getHousingUnits().forEach(unit -> System.out.println(unit.getLocation()));

        System.out.println("Please select a housing unit from the list:");
        String selectedLocation = scanner.nextLine();

        HousingUnit selectedHousingUnit = housingUnitManager.getHousingUnitByLocation(selectedLocation);

        if (selectedHousingUnit != null) {
            System.out.println("Details of the selected housing unit:");
            System.out.println("Location: " + selectedHousingUnit.getLocation());
            System.out.println("Services: " + selectedHousingUnit.getServices());
            System.out.println("Monthly Rent: $" + selectedHousingUnit.getMonthlyRent());
            System.out.println("Pictures showcasing the housing unit's interior and exterior.");
        } else {
            System.out.println("Housing unit with location " + selectedLocation + " not found.");
        }

        scanner.close();
    }
}
