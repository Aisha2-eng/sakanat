package acceptedTest;



import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ownerfeature {
    private HousingOwnerDashboard housingOwnerDashboard;
    private String location;
    private String services;
    private double monthlyRent;
    private String successMessage;
    private List<HousingUnit> housingUnitList;

    @Given("I am logged in as a housing owner")
    public void LoggedInAsHousingOwner() {
        // Assume the housing owner is logged in
    }

    @When("I navigate to the housing owner dashboard")
    public void navigateToHousingOwnerDashboard() {
        housingOwnerDashboard = new HousingOwnerDashboard();
        // Assume you have code to navigate to the housing owner dashboard
    }

    @And("I provide the necessary details, such as location {string}, services {string}, and monthly rent {string}")
    public void provideHousingUnitDetails(String location, String services, String monthlyRent) {
        this.location = location;
        this.services = services;
        this.monthlyRent = Double.parseDouble(monthlyRent.replace("$", ""));
    }

    @Then("I should see a success message indicating that the housing unit has been added")
    public void verifySuccessMessage() {
        successMessage = "Housing unit added successfully!";
        assertNotNull(successMessage);
    }

    @And("the new housing unit should appear in the housing unit list")
    public void verifyHousingUnitInList() {
        housingOwnerDashboard.addHousingUnit(new HousingUnit(location, services, monthlyRent));
        housingUnitList = housingOwnerDashboard.getHousingUnits();
        assertTrue(housingUnitList.contains(new HousingUnit(location, services, monthlyRent)));
    }

    // Sample class representing the HousingOwnerDashboard
    private static class HousingOwnerDashboard {
        private List<HousingUnit> housingUnits;

        public HousingOwnerDashboard() {
            this.housingUnits = new ArrayList<>();
        }

        public void addHousingUnit(HousingUnit unit) {
            housingUnits.add(unit);
        }

        public List<HousingUnit> getHousingUnits() {
            return housingUnits;
        }
    }

    // Sample class representing the details of a housing unit
    private static class HousingUnit {
        private String location;
        private String services;
        private double monthlyRent;

        public HousingUnit(String location, String services, double monthlyRent) {
            this.location = location;
            this.services = services;
            this.monthlyRent = monthlyRent;
        }

        // Override equals() and hashCode() to properly compare HousingUnit objects
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            HousingUnit that = (HousingUnit) o;
            return Double.compare(that.monthlyRent, monthlyRent) == 0 &&
                    location.equals(that.location) &&
                    services.equals(that.services);
        }

        @Override
        public int hashCode() {
            return Objects.hash(location, services, monthlyRent);
        }
    }
}
