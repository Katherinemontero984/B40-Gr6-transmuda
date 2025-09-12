Feature: All users should be able to access main modules

  Scenario: Store Manager sees 8 main modules
    Given the user logged in as "store manager"
    Then the user should be able to see the following modules:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Scenario: Sales Manager sees 8 main modules
    Given the user logged in as "sales manager"
    Then the user should be able to see the following modules:
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |

  Scenario: Driver sees 4 main modules
    Given the user logged in as "driver"
    Then the user should be able to see the following modules:
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |