Feature: Scoring
  I want to use this template for my feature file

  Scenario Outline: User story
    Given I am a sports administrator
    When I register an <athlete> 
    And I register their <result>
    Then I want to see the total score

    Examples: 
     |athlete| result |
     | "Lars" | 10 | # Lars, 10 sekunder