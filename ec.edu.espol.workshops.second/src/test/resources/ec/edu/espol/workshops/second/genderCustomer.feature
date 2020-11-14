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
Feature: What is your gender ?
  I want to use this template for my feature file

  @tag1
  Scenario: other isn't Gender
		Given I am other
		When I ask about your gender
		Then I should be told gender "Nope"

  @tag2
  Scenario Outline: I am Male
		Given gender is "<gender>"
		When I ask if you are male
		Then I should be told gender "<answer>"

    Examples: 
      | gender | answer |
      | F | YAS |
      | M | YAS |
      | anything else! | Nope |