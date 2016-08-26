Feature: Hello

   Scenario: Say hello
     Given I have a hello app
     When I ask it to say hello
     Then it should answer with "hello!"