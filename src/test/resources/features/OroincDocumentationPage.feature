Feature: Accessing Oroinc Documentation Page

  @wip
  Scenario Outline: User accesses Oroinc Documentation page
    Given  user is on the home page
    When   user enter the "<user_type>" information
    Then   user should be able to login
    And    user click on the "question mark" icon
    Then   user should be redirected to "<https://doc.oroinc.com/>"

    Examples:
      | Truck Driver  |  | https://doc.oroinc.com/ |
      | Sales Manager |  | https://doc.oroinc.com/ |
      | Store Manager |  | https://doc.oroinc.com/ |

