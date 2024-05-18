Feature: Chicken Collecting Insects Calculator

  Scenario: Chicken collects insects for several minutes
    Given a chicken collects 3 insects per minute
    When chicken has searched insects for 5 minutes
    Then the chicken has found 15 insects

  Scenario: Chicken collects insects for several hours
    Given a chicken collects 2 insects per minute
    When chicken has searched insects for 2 hours
    Then the chicken has found 240 insects