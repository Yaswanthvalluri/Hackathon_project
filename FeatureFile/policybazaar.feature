Feature: Policy Bazaar

  Scenario Outline: Travel insurance for students
    Given user is on the policy bazaar site
    When user click on travel insurance
    And user selects the destination "<Destination Name>"
    And user selects the trip duration
    And user selects the count and age of travellers
    And user submit the medical condition survey
    And user provide the mobile number "<mobile number>"
    Then user selects student plans
    And user provide the typical trip duration
    And user modify the content with sort by
    And print lowest three plans
    
     Examples: 
      | Destination Name | mobile number |
      | France           |    6387642192 |

  Scenario: Car insurance
    Given user is on the policy bazaar web site
    When user click on car insurance
    Then user click on the buying new car
    And user click on the prefered city
    And user click on the prefered area
    And user click on the prefered brand
    And user click on the prefered model
    And user click on the prefered varient
    And user click on the prefered varient version
    And user enter invalid details
    And user back to home page

  Scenario: Health insurance
    Given user is on the policy bazaar web link
    When user click on insurance products
    Then user prints health insurance products
    
    
 
    
    
   
