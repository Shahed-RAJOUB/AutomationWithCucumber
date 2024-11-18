Feature: Application Login

  Background:
    When launch the browser from config variables
    And hit the home page url of banking site

    # lets imagine there are seperate DB for netbanking and Mortage and different resources , background might not work
  @Regression @Netbanking
  Scenario: User Page default login
    Given User is on Netbanking landing page
    When User login into application with "user" and password "563"
    Then Home Page is displayed
    And Cards are displayed


    # parameterized tests
  @SmokeTest @Mortage
  Scenario Outline: User Page default login from parameters
    Given User is on Netbanking landing page
    When User login into application with "<user>" and password "<pass>"
    Then Home Page is displayed
    And Cards are displayed

    Examples:
      | user  | pass |
      | test1 | 258  |
      | test2 | 2586 |