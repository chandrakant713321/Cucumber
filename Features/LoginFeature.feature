Feature: Login

  Scenario: Login google page
    Given User is on google page
    When User neter text as "citi.com"
    And Hit enter button
    Then User shoud get required page
