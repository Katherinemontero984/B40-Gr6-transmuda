@calendarEvent
Feature: User should be able to create a recurring calendar event

  Background: User is already in the log in page
    Given the user is on the login page

  @repeatDefaultValue
  Scenario Outline: User Verifies default value of "Repeat Every" field
    And the user logged in as "<userType>"
    And User navigates to the module
    When User clicks at the "Create Calendar Event" button
    And User opens the "Repeat" section
    Then The default value of Repeat Every should be "1"

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |


  @repeatFieldError
  Scenario Outline: User Verifies error message when "Repeat Every" field is cleared
    And the user logged in as "<userType>"
    And User navigates to the module
    When User clicks at the "Create Calendar Event" button
    And User opens the "Repeat" section
    And User clears the Repeat Every input field
    And User clicks anywhere on the page
    Then The error message "This value should not be blank." should be displayed

    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |