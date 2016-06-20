Feature: FizzBuzz
	As an innumerate person
	I want a program to play FizzBuzz for me
	So that my friends do not laugh at me

  Scenario: a number not divisible by three or five
    Given the number 1
    When I play FizzBuzz
    Then I say "1"