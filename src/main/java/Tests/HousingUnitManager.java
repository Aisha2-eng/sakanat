// Package: Tests

package Tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HousingUnitManager {
    private Map<String, HousingUnit> housingUnits;

    public HousingUnitManager() {
        this.housingUnits = new HashMap<>();
    }

    public void addHousingUnit(HousingUnit unit) {
        housingUnits.put(unit.getLocation(), unit);
    }

    public List<HousingUnit> getHousingUnits() {
        return new ArrayList<>(housingUnits.values());
    }

    public HousingUnit getHousingUnitByLocation(String location) {
        return housingUnits.get(location);
    }
}
