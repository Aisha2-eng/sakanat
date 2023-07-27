Feature: Booking Accommodation
  As a user
  I want to be able to book accommodation
  So that I can secure a place to stay


  Scenario Outline: User successfully books accommodation
    Given I am on the housing details page
    When I select a specific housing unit "<HousingUnit>"
    And I select the desired dates "<Dates>" and duration "<Duration>" of my stay
    And I provide the necessary personal information as "<Name>", "<Dates>", "<Duration>", and "<Email>"
    And I confirm the booking
    Then I should see a confirmation message for my booking
    And I should receive a confirmation email with booking details

    Examples:
      | Name         | HousingUnit   | Dates        | Duration  | Email                |
      | "Alex Smith" | "Apartment 1" | "2023-08-10" | "7 days"  | "alexsmith@gmail.com" |
      | "roz malter" | "Villa 5"     | "2023-09-01" | "14 days" | "rozmalter@gmail.com" |


