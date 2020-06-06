Feature: Feature file to test login scenarios

  Scenario: Test valid login
    Given I am on mercury home page
    When I give valid crednetials
    Then I should see flight search page

