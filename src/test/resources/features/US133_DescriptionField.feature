@US_133
Feature: Description field feature

  User Story: As a user, I want to write the “Description” when I create a calendar event. (Iframe)

  Background: User is already on the login page
    Given the user is on the login page


  Scenario Outline: User will write a message in Description field
    When the user logged in as "<userType>"
    And User navigates to the module
    And User clicks at the "Create Calendar Event" button
    When User selects "Description" field
    And User types a message "Hello World"
    Then Message should be visible


    Examples:
      | userType      |
      | Store Manager |
      | Sales Manager |
      | Driver        |
