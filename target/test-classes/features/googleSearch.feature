Feature: Google search functionality
  Agile story: as a user, when I am on the Google search page
  I should be able to search whatever I want relevant information

  Scenario: Search page title verification
    When user is on Google search page
    Then user see title is Google


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types apple and clicks enter
    Then user sees apple in the google title


  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the google title

