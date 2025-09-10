Feature: Accessing Oroinc Documentation Page

  Background: User is already on the log in page

  @wip
  Scenario Outline: User accesses Oroinc Documentation page
    Given   user is on the home page
    When    the user is logged in as "<userType>"
    And     user click on the "question mark" icon
    Then    a new window should open with URL "<https://doc.oroinc.com/>"

    Examples:
      | userType      | https://doc.oroinc.com/ |
      | driver        | https://doc.oroinc.com/ |
      | sales manager | https://doc.oroinc.com/ |
      | store manager | https://doc.oroinc.com/ |

