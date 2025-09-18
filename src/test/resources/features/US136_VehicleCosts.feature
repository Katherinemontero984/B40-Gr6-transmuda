@US136
Feature: Vehicle Costs filters

  Background:
    Given the user is on the login page

  Scenario Outline: Verify the 3 column headers
    And the user logged in as "<userType>"
    And the user navigates to "Fleet" -> "Vehicle Costs"
    Then the user should see table headers:
      | TYPE        |
      | TOTAL PRICE |
      | DATE        |

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |

  Scenario Outline: Verify master checkbox selects/deselects all (current page)
    And the user logged in as "<userType>"
    And the user navigates to "Fleet" -> "Vehicle Costs"
    When the user checks the master checkbox
    Then all row checkboxes on the current page should be selected
    When the user unchecks the master checkbox
    Then all row checkboxes on the current page should be unselected

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
