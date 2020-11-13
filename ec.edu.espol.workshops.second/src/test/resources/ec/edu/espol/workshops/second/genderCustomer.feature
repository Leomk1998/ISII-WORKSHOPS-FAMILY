#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: What is your gender?
  I want to use this template for my feature file

  @tag1
  Scenario: Is invalid gender
		Given other
		When I ask about your gender
		Then I should be told "F or M"

  @tag2
  Scenario Outline: F or M is gender
		Given "<gender>"
		When Your gender is F or M
		Then I should be told "<answer>"

    Examples: 
      | gender | answer |
			| F | YAS |
			| M | YAS |
			| anything else! | Nope |
