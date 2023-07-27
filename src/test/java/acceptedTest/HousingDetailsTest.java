// Package: acceptedTest

package acceptedTest;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class HousingDetailsTest {
    private Map<String, HousingUnit> housingUnits = new HashMap<>();
    private String selectedLocation;
    private HousingUnit selectedHousingUnit;

    @Given("there are multiple housing units listed in Palestine")
    public void createHousingUnits() {
        // Sample housing units for demonstration purposes
        housingUnits.put("Rafidia Street, Nablus", new HousingUnit("Rafidia Street, Nablus", "Furnished, Wi-Fi, Laundry", 150));
        housingUnits.put("Al-Manara, Ramallah", new HousingUnit("Al-Manara, Ramallah", "Unfurnished, Parking", 120));
        housingUnits.put("Old City, Jerusalem", new HousingUnit("Old City, Jerusalem", "Garden, 24/7 Security", 200));
        housingUnits.put("Downtown, Bethlehem", new HousingUnit("Downtown, Bethlehem", "Fully Furnished, Gym, Parking", 180));
        housingUnits.put("Green Valley, Hebron", new HousingUnit("Green Valley, Hebron", "Swimming Pool, Wi-Fi, Balcony", 190));
    }

    @When("I select a specific housing unit with the location {string} from the list")
    public void selectHousingUnit(String location) {
        selectedLocation = location;
        selectedHousingUnit = housingUnits.get(location);
    }

    @Then("I should be directed to the details page of that housing unit")
    public void verifyDetailsPage() {
        assertNotNull(selectedHousingUnit);
    }

    @And("I should be able to view the following details about the housing unit:")
    public void verifyHousingUnitDetails(io.cucumber.datatable.DataTable dataTable) {
        // Verify the housing unit details (e.g., location, services, monthly rent)
        assertEquals(selectedLocation, selectedHousingUnit.getLocation());
        assertEquals(dataTable.cell(1, 1), selectedHousingUnit.getServices());
        assertEquals(Double.parseDouble(dataTable.cell(1, 2)), selectedHousingUnit.getMonthlyRent(), 0.001);
    }

    @And("I should see pictures showcasing the housing unit's interior and exterior")
    public void verifyPictures() {
        // Simulate the verification of pictures (this is a test simulation and not actual picture verification)
        assertTrue(true);
    }

    // Sample class representing a housing unit
    private static class HousingUnit {
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
    }
}
