@wip_Borys
Feature: user should be able to access the Vehicles Model Page
  User Story : As a user, I want to view columns on the Vehicles Model page. (web-table)
  Expected Column names:
  MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (/MONTH), COST (DEPRECIATED),
  TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS
  Verify that Drivers cannot access the Vehicles Model page and see
  “You do not have permission to perform this action.” message on the screen.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline:
  Verify that the Store manager and Sales manager can see 10 columns on the Vehicles Model page
    Given the user logged in as "<userType>"
    And navigates to the fleet option on the menu
    Then clicks on the Vehicles Model Option
    Then user should be able to see the 10 expected columns for every vehcihcle loaded into the system
    And driver should see “You do not have permission to perform this action.” if they try to access the same page



    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |

