@Navigate
Feature: Logged in the sales manager should be able to navigate to pages using the top menu.

  Scenario:
    Given Logged in sales manager
    When the user is in the vehicles page
    Then the user should see correct page url

  Scenario:
    Given Logged in sales manager
    When the user is in the campaings page
    Then the user should see campaigns page url
