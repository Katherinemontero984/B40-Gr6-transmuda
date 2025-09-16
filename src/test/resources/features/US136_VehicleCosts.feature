@US136
Feature: Vehicle Costs filters

  @US136_AC01_TC01 @smoke
  Scenario Outline: Verify the 3 column headers
    When the user logs in as "<userType>"
    And the user navigates to "Fleet" -> "Vehicle Costs"
    Then the user should see table headers:
      | TYPE | TOTAL PRICE | DATE |
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |

  @US136_AC02_TC01 @regression
  Scenario Outline: Verify master checkbox selects/deselects all rows
    When the user logs in as "<userType>"
    And the user navigates to "Fleet" -> "Vehicle Costs"
    And the user checks the master checkbox
    Then all row checkboxes on the current page should be selected
    When the user unchecks the master checkbox
    Then all row checkboxes on the current page should be unselected
    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
