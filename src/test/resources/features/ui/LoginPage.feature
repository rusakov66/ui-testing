Feature: First tests

  @UI @aaaa
  Scenario: Navigate to the Bomba with Chrome browser and do search
    Given I open site 'https://bomba.md' with 'Chrome' browser
    When I type in the search box word 'Холодильник'
    Then I am on the searching page

  @UI @aaaa
  Scenario: Navigate to the Maximum with Chrome browser and do search
    Given I open site 'https://maximum.md' with 'Chrome' browser
    When I type in the search box word 'Холодильник'
    Then I am on the searching page