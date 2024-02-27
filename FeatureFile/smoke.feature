@smoke
Feature: Policy Bazaar site

  Scenario: Is travel insurance enabled
    Given user is on the policy bazaar site
    Then user verifies the travel insurance icon

  Scenario: user prefers travel insurance
    Given user is on the policy bazaar site
    When user click on travel insurance

  Scenario Outline: user prefers the destination
    Given user is in destinations page
    When user selects the destination "<Destination Name>"

    Examples: 
      | Destination Name |
      | France           |

  Scenario: user prefers the time intervel
    Given user is in on the trip date page
    When user selects the trip duration

  Scenario: number of users and their age
    Given user is on the travellers page
    When user selects the count and age of travellers

  Scenario: users medical condition
    Given user is on the medical history page
    When user submit the medical condition survey

  Scenario Outline: users contact details
    Given user is on the contact details page
    When user provide the mobile number "<mobile number>"

    Examples: 
      | mobile number |
      |    6387642192 |

  Scenario: Is policy bazar icon navigates back
    Given user is on the traveller insurance plans page
    When user clicks on the policy bazaar icon

  Scenario: Is car insurance enabled
    Given user is on the policy bazaar site
    Then user verifies the car insurance icon

  Scenario: user prefers car Insurance
    Given user is on the policy bazaar site
    When user click on car insurance

  Scenario: user prefers buying new car
    Given user is on the car insurance page
    Then user click on the buying new car

  Scenario: user prefers city
    Given user is on the city and rto page
    Then user click on the prefered city

  Scenario: user prefers the area
    Given user is on the city and rto page
    Then user click on the prefered area

  Scenario: user prefers the brand
    Given user is on the select car brand site
    Then user click on the prefered brand

  Scenario: user prefers the model
    Given user is on the select car model page
    Then user click on the prefered model

  Scenario: user prefers the fuel type
    Given user is on the select car fuel type page
    Then user click on the prefered varient

  Scenario: user prefers the car varient
    Given user is on the select car varient page
    Then user click on the prefered varient version

  Scenario: user filling details
    Given user is on the filling details page
    Then user enter invalid details

  Scenario: Is policy bazaar icon navigates back
    Given user is on the filling details page 
    Then user back to home page

  Scenario: Is insurance products displayed
    Given user is on the policy bazaar site
    Then user verifies the whether insurance products displayed

  Scenario: Is health insurance products displayed
    Given user is on the policy bazaar site
    Then user verifies the whether health insurance products displayed
