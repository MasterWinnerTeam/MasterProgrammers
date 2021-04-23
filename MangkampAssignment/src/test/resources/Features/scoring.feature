Feature: Scoring
  I want to use this template for my feature file

  Scenario Outline: User story
    Given I am a sports administrator
    When I register an <athlete> 
    And I also register their <sport>
    And I register their <result>
    Then I want to see the total score

    Examples: 
     |athlete| sport | result |
     | "Lars" | "track" | 10 | # Lars, 10 sekunder