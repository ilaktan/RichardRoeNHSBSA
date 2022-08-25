@wip
Feature:User under 18 years old testing the NHS "need to know what help I can get with my NHS costs" functionality

  Scenario:User in full-time education
    Given User open browser
    When User on the website page
    Then User click the I am OK with cookies
    And User click the "Start button"
    Then User select the "Wales"
    And User click the "Next button"
    Then Is User GP practice in Scotland or Wales? "yes"
    And User click the "Next button"
    Then User select the "Wales"
    And User click the "Next button"
    Then User enter date of birth "1" "1" "2005"
    And User click the "Next button"
    And Is you in full-time education? "yes"
    And User click the "Next button"
    And User should see "You get free:"

  Scenario:User is closing browser
    Then User close browser

  Scenario:User not in full-time education,not live with a partner, not claim any benefits,not given birth,not have more than £ "16000" in savings
    Given User open browser
    When User on the website page
    Then User click the I am OK with cookies
    And User click the "Start button"
    Then User select the "Wales"
    And User click the "Next button"
    Then Is User GP practice in Scotland or Wales? "yes"
    And User click the "Next button"
    Then User select the "Wales"
    And User click the "Next button"
    Then User enter date of birth "1" "1" "2005"
    And User click the "Next button"
    Then Is you in full-time education? "no"
    And User click the "Next button"
    Then Do User live with a partner? "no"
    And User click the "Next button"
    Then User or partner  claim any benefits or tax credits "no"
    And User click the "Next button"
    Then Is User pregnant or have User given birth in the last twelve months? "no"
    And User click the "Next button"
    Then Do User have an injury or illness caused by serving in the armed forces? "no"
    And User click the "Next button"
    Then Do User have diabetes? "no"
    And User click the "Next button"
    Then Do User have glaucoma? "no"
    And User click the "Next button"
    Then Do you live permanently in a care home? "no"
    And User click the "Next button"
    Then Do User have more than £ "16000" in savings, investments or property? "no"
    And User click the "Next button"
    And User should see "How to get your help"


  Scenario: User is closing browser
    Then User close browser

  Scenario:User not in full-time education,live with a partner, not claim any benefits,not given birth,not have more than £ "16000" in savings
    Given User open browser
    When User on the website page
    Then User click the I am OK with cookies
    And User click the "Start button"
    Then User select the "Wales"
    And User click the "Next button"
    Then Is User GP practice in Scotland or Wales? "yes"
    And User click the "Next button"
    Then User select the "Wales"
    And User click the "Next button"
    Then User enter date of birth "1" "1" "2005"
    And User click the "Next button"
    Then Is you in full-time education? "no"
    And User click the "Next button"
    Then Do User live with a partner? "yes"
    And User click the "Next button"
    Then User or partner  claim any benefits or tax credits "no"
    And User click the "Next button"
    Then Is User pregnant or have User given birth in the last twelve months? "no"
    And User click the "Next button"
    Then Do User have an injury or illness caused by serving in the armed forces? "no"
    And User click the "Next button"
    Then Do User have diabetes? "no"
    And User click the "Next button"
    Then Do User have glaucoma? "no"
    And User click the "Next button"
    Then Do you live permanently in a care home? "no"
    And User click the "Next button"
    Then Do User have more than £ "16000" in savings, investments or property? "no"
    And User click the "Next button"
    And User should see "How to get your help"

  Scenario: User is closing browser
    Then User close browser

  Scenario:User  have more than £ "16000" in savings
    Given User open browser
    When User on the website page
    Then User click the I am OK with cookies
    And User click the "Start button"
    Then User select the "Wales"
    And User click the "Next button"
    Then Is User GP practice in Scotland or Wales? "yes"
    And User click the "Next button"
    Then User select the "Wales"
    And User click the "Next button"
    Then User enter date of birth "1" "1" "2005"
    And User click the "Next button"
    Then Is you in full-time education? "no"
    And User click the "Next button"
    Then Do User live with a partner? "no"
    And User click the "Next button"
    Then User or partner  claim any benefits or tax credits "no"
    And User click the "Next button"
    Then Is User pregnant or have User given birth in the last twelve months? "no"
    And User click the "Next button"
    Then Do User have an injury or illness caused by serving in the armed forces? "no"
    And User click the "Next button"
    Then Do User have diabetes? "no"
    And User click the "Next button"
    Then Do User have glaucoma? "no"
    And User click the "Next button"
    Then Do you live permanently in a care home? "no"
    And User click the "Next button"
    Then Do User have more than £ "16000" in savings, investments or property? "yes"
    And User click the "Next button"
    And User should see "How to get your help"

  Scenario: User is closing browser
    Then User close browser