@calendarEvent
Feature: User should be able to create a recurring calendar event

  Background: User is already on the home page
    Given the user logged in as "<userType>"
    Given the user logged in with username as "User1" and password as "UserUser123"
    And User navigates to the "Activities" section
    And User opens the "Calendar Events" page
    When User cliks at the "Create Calendar Event" button
    Then User cliks at the "Repeat" input field


Scenario: Verify that users see the number “1” by default in the Repeat Every input option
  Given User is on the "Calendar Events" page
  Then User has opened the "Repeat" section
  Then The default value of "Repeat Every" should be "1"



  Scenario: Verify that users see the error message “This value should not be blank.” when the Calendar event Repeat Every field is cleared
    Given User is on the "Calendar Events" page
    When User clears the "Repeat Every" input field
    Then User clicks anywhere on the page
    Then The error message "This value should not be blank." should be displayed

