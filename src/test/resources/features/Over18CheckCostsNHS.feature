@wip
Feature:User over 18 years old testing the NHS "need to know what help I can get with my NHS costs" functionality

  Scenario:User living with a partner,claim any benefits or tax credits,get paid Universal Credit,User joint Universal Credit,take-home pay of £935 or less
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
    Then User enter date of birth "1" "1" "1999"
    And User click the "Next button"
    Then User is living with a partner "yes"
    And User click the "Next button"
    Then User or partner  claim any benefits or tax credits "yes"
    And User click the "Next button"
    Then User or partner  get paid Universal Credit "yes"
    And User click the "Next button"
    Then User joint Universal Credit, User have any of these "child or young person who lives with User" "yes"
    And User click the "Next button"
    Then and your partner have a combined take-home pay of £935 or less in your last Universal Credit period "yes"
    And User click the "Next button"
    And User should see "You get free:"

  Scenario:User is closing browser
    Then User close browser
