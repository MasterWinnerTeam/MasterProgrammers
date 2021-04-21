Feature: Scoring
  I want to use this template for my feature file

  Scenario Outline: User story
    Given I am a sports adminstraitor
    When I register an <athlete> and their <result>
    Then I want to see the total score

    Examples: 
     |athlete| result |
     | name1 | 10 |
