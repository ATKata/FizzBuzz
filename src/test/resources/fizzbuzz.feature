Feature: FizzBuzz
	As an innumerate person
	I want a program to play FizzBuzz for me
	So that my friends do not laugh at me

  Scenario: a number not divisible by three or five
    Given the number 1
    When I play FizzBuzz
    Then I say "1"
    
   Scenario: a number divisible by 3
   	Given the number 3
   	When I play FizzBuzz
   	Then I say "Fizz"
   	
   Scenario: a number divisible by 5
   	Given the number 5
   	When I play FizzBuzz
   	Then I say "Buzz"
   	
   Scenario: a number divisible by 3 and 5
   	Given the number 15
   	When I play FizzBuzz
   	Then I say "FizzBuzz"
   	