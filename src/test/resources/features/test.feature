Feature: Google Search
@wip
  Scenario: User Searches on google
    Given User is on google home page
    When User google enters apple into search bar
    And User clicks enter
    Then User is redirected to the results