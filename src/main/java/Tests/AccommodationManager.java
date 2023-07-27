package Tests;

import java.util.ArrayList;
import java.util.List;

public class AccommodationManager {
    private List<Accommodation> accommodations;

    public AccommodationManager() {
        this.accommodations = new ArrayList<>();
    }

    public void addAccommodation(String name, String services, double monthlyRent) {
        Accommodation accommodation = new Accommodation(name, services, monthlyRent);
        accommodations.add(accommodation);
    }

    public List<Accommodation> getAccommodations() {
        return accommodations;
    }

    // Other methods and logic relevant to the accommodation manager
}
