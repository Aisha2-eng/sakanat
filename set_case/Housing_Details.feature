Feature: Housing Details

  As a user, I want to access comprehensive information about a housing unit in Palestine
  So that I can make an informed decision when looking for a place to rent.

  Scenario Outline: User views the details of a specific housing unit
    Given there are multiple housing units listed in Palestine
    When I select a specific housing unit with the location "<Location>" from the list
    Then I should be directed to the details page of that housing unit
    And I should be able to view the following details about the housing unit:
      | Detail         | Value                 |
      | Price          | <MonthlyRent>         |
      | Location       | <Location> in Palestine |
      | Services       | <Services>            |
    And I should see pictures showcasing the housing unit's interior and exterior.

    Examples:
      | Location                   | Services                          | MonthlyRent |
      | Rafidia Street, Nablus     | Furnished, Wi-Fi, Laundry         | $150        |
      | Al-Manara, Ramallah        | Unfurnished, Parking              | $120        |
      | Old City, Jerusalem        | Garden, 24/7 Security             | $200        |
      | Downtown, Bethlehem        | Fully Furnished, Gym, Parking     | $180        |
      | Green Valley, Hebron       | Swimming Pool, Wi-Fi, Balcony     | $190        |
