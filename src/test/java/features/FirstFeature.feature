Feature: Application Login

  Background:
    Given Setup the entries in database
    When launch the browser from config variables
    And hit the home page url of banking site

  Scenario: Admin Page default login
    Given User is on Netbanking landing page
    When User login into application with "admin" and password "123"
    Then Home Page is displayed
    And Cards are displayed

  @Regression
  Scenario: User Page default login
    Given User is on Netbanking landing page
    When User login into application with "user" and password "563"
    Then Home Page is displayed
    And Cards are displayed

  Scenario: User Page default login from regex
    Given User is on Netbanking landing page
    When User login into application with user and password 563
    Then Home Page is displayed
    And Cards are displayed

    # parameterized tests
  @SmokeTest
  Scenario Outline: User Page default login from parameters
    Given User is on Netbanking landing page
    When User login into application with "<user>" and password "<pass>"
    Then Home Page is displayed
    And Cards are displayed

    Examples:
      | user  | pass |
      | test1 | 258  |
      | test2 | 2586 |


  @SmokeTest @Regression
  Scenario: User Page default login with data nesting SignUp
    Given User is on Practice landing page
    When User signup into application
      | test3         |
      | family        |
      | test@test.com |
      | 25369         |
    Then Home Page is displayed
    And Cards are displayed