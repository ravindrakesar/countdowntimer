@countdown
Feature: To test the count down timer functionality

  Scenario: Navigate to countdown timer page

    Given I have navigated to countdown page
    When I verify page title
    Then I verify page load
    When I start the countdown timer and verify 1 sec decrements
    Then I close the browser