@US03
Feature: Transmuda pinbar functionality
  User Story: As a user, I want to learn how to use the pinbar.

  Background: User is already on the login page
    Given the user is on the login page

  @US03_AC01_TC01
  Scenario Outline: Verify user is able to navigate to "Learn how to use this space" link
    Then the user logged in as "<userType>"
    When the user clicks the "Learn how to use this space" link
    Then the user sees "How To Use Pinbar" header text
    And the user sees "Use pin icon on the right top corner of page to create fast access link in the pinbar." text

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |


  @US03_AC02_TC01
  Scenario Outline: Verify user is able to see an image on the page
    Then the user logged in as "<userType>"
    When the user clicks the "Learn how to use this space" link
    Then the user sees an image

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |




