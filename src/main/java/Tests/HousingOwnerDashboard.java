package Tests;

import java.util.ArrayList;
import java.util.List;

public class HousingOwnerDashboard {
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

    // Other methods and logic relevant to the housing owner dashboard
}

