@modules
Feature: User I should be able to access all the main modules of the app.

  Background: User is already on the log in page
    Given the user is on the login page

  @salesManager         # US124_AC01_TC01
  Scenario Outline: User can see their main modules when on home page
    Given the user logged in as "Sales Manager"
    Then sale manager sees "<expectedModules>" in the main modules

    Examples:
      | expectedModules    |
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  @storeManager         # US124_AC01_TC02
  Scenario Outline: User can see their main modules when on home page
    Given the user logged in as "Store Manager"
    Then store manager sees "<expectedModules>" in the main modules

    Examples:
      | expectedModules    |
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |


  @driver              # US124_AC02_TC01
  Scenario Outline: Driver can see their main modules when on home page
    Given the user logged in as "Driver"
    Then driver sees "<expectedModules>" in the main modules

    Examples:
      | expectedModules |
      | Fleet           |
      | Customers       |
      | Activities      |
      | System          |





