Feature: View Car Odometer Info
  Agile story: As a user, I want to view car odometer info on the Vehicles Odometer page.

  Background: User is already in the log in page
    Given user is on the login page


  Scenario Outline: Login with Sales and store manager
    When user enter the username "<username>" and password "<password>"
    And the user hover over "Fleet" and selects "Vehicle Odometer" from the dropdown
    Then I should see the error message: "You do not have permission to perform this action."

    Examples:
      | username        | password    |
      | salesmanager25| UserUser123 |
      | storemanager25  | UserUser123 |
