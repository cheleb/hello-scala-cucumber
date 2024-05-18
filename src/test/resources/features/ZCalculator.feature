Feature: ZCalculator

  ZCalculator is a simple calculator that can add, subtract, multiply and divide numbers.

  Scenario Outline: There can be only One

  @release:iteration-1
  @Department:IT
  Rule: ZIO should be able to count
    Scenario: Random number
      Given 3 random numbers
      When adding those numbers
      Then the result is > 0


