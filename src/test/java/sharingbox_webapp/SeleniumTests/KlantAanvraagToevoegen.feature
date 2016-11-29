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
Feature: Customer adds request
	I want to use this template for my feature file

@tag1
Scenario: The customer wants to add a request
Given I am logged in as klant
When I am on the klantscreen
	And I type "11/01/2016 12:50 AM" as date
	And I give "toiletstraat 6 1900 Eindhoven" as adres
	And I submit the form
Then I should see the info is confirmed
	


