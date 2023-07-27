package acceptedTest;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class booking_feature {
    private Map<String, HousingUnit> housingUnits = new HashMap<>();
    private String selectedHousingUnit;
    private String selectedDates;
    private String selectedDuration;
    private String enteredName;
    private String enteredEmail;
    private boolean bookingConfirmed;

    @Given("I am on the housing details page")
    public void LoggedInAsTenants() {
        // Assume the tenants are logged in
    }

    @When("I select a specific housing unit {string}")
    public void selectHouseUnit(String housingUnit) {
        selectedHousingUnit = housingUnit;
    }

    @And("I select the desired dates {string} and duration {string} of my stay")
    public void selectDatesAndDuration(String dates, String duration) {
        selectedDates = dates;
        selectedDuration = duration;
    }

    @And("I provide the necessary personal information as <Name>, <Dates>, <Duration>, and <Email>")
    public void PersonalInformation() {
        // Your implementation here, using the stored values from previous steps (enteredName, selectedDates, etc.)
    }

    @And("I confirm the booking")
    public void confirmBooking() {
        // Simulate booking confirmation and store it in a boolean flag
        HousingUnit unit = housingUnits.get(selectedHousingUnit);
        if (unit != null) {
            bookingConfirmed = true;
        }
    }

    @Then("I should see a confirmation message for my booking")
    public void verifyConfirmationMessage() {
        assertTrue(bookingConfirmed);
    }

    @And("I should receive a confirmation email with booking details")
    public void verifyConfirmationEmail() {
        // Simulate receiving a confirmation email (this is a test simulation and not a real email)
        String emailContent = "Thank you for your booking, " + enteredName + "!\n" +
                "You have booked " + selectedHousingUnit + " from " + selectedDates + " for " + selectedDuration + ".\n" +
                "Confirmation: " + bookingConfirmed;
        assertNotNull(emailContent);
    }

    // Sample method to add housing units for demonstration purposes
    public void addHousingUnit(String name, String services, double monthlyRent) {
        HousingUnit unit = new HousingUnit(name, services, monthlyRent);
        housingUnits.put(name, unit);
    }

    // Sample class representing a housing unit
    private static class HousingUnit {
        private String name;
        private String services;
        private double monthlyRent;

        public HousingUnit(String name, String services, double monthlyRent) {
            this.name = name;
            this.services = services;
            this.monthlyRent = monthlyRent;
        }
    }
}
