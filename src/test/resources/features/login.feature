Feature: Login_MakeMyTrip

  @LoginMakeMyTrip
  Scenario: BookFlight
    Given Launch MakeMyTrip Website
    When Select One way Flight
    And Select the from Destination as "Chennai" from "MAA" Airport
    And Select the To Destination as "Mumbai" from "BOM" Airport
  And Select todays date
  And Search for flights
#    Then select departure and destination


