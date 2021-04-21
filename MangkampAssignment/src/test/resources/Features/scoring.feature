Feature: Scoring
  I want to use this template for my feature file

  Scenario Outline: User story
    Given I am a sports administrator
    And an <athlete> has generated a result
    When I register the athlete's score for the <event>
    Then I want to see the <result>
   # Then I want to see the total result

    Examples: 
     |athlete | event | result |
     | name1 | something | success |
