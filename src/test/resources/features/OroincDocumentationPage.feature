
Feature: Accessing Oroinc Documentation Page
  AC: Verify that users access to the Oroinc Documentation page by clicking the question mark icon.
  The page’s URL is: https://doc.oroinc.com/

  Background: User is already on the log in page
    Given     the user is on the login page

  @US_125
  Scenario Outline: User accesses Oroinc Documentation page
    When    the user logged in as "<userType>"
    And     user click on the "question mark" icon
    And     user navigates to oroinc documentation page
    Then    user will access the documentation page

    Examples:
      | userType      |
      | Driver        |
      | Sales manager |
      | Store manager |

