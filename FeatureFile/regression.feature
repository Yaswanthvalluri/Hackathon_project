@regression
Feature: Policy Bazaar web site
  

  Scenario: user prefers the student plans
    Given user is on the policy bazaar site
    When user click on travel insurance
    And user selects the destination "<Destination Name>"
    And user selects the trip duration
    And user selects the count and age of travellers
    And user submit the medical condition survey
    And user provide the mobile number "<mobile number>"
    Then user selects student plans
    
      Examples: 
      | Destination Name | mobile number |
      | France           |    6387642192 |
    

  Scenario: user is giving students travel information
    Given user is on popup
    Then user provide the typical trip duration

  Scenario: user is sorting the insurance
    Given user is on the traveller insurance plans page
    Then user modify the content with sort by

  Scenario: user is printing the insurance
    Given user is on the traveller insurance plans page
    Then print lowest three plans

  Scenario: user is printing the health insurance menu
    Given user is on the policy bazaar web link
    And user click on insurance products
    Then user prints health insurance products
