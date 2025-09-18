@wip_Borys
Feature: View Columns on Vehicles Model Page As a user,
  I want to view columns on the Vehicles Model page to access relevant vehicle information based on my role.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Authorized users can view columns on the Vehicles Model page
    Given the user logged in as "<userType>"
    When I navigate to the Vehicles Model page as a manager
    Then I should access the page
    And the page should display the expected Columns:


      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |


  Scenario Outline: Unauthorized users are denied access to the Vehicles Model page
    Given the user logged in as "<userType>"
    When I navigate to the Vehicles Model page as a driver
    Then I should be denied access to the page
    And the page should display the message "You do not have permission to perform this action."

    Examples:
      | userType |
      | Driver   |