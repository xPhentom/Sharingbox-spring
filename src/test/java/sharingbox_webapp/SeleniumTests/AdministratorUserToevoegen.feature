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
Feature: Add user as administrator
	

@tag1
 Scenario: As logged in administrator, I want to add a user
 		Given I am on the administrator page
 		And I click on Persoon Toevoegen
 		And I am relocated to the persoon toevoegen page
 		And I give in "Jan" as first name
 		And I give in "Jansens" as last name
 		And I five in "jan.jansens@test.com" as mailadres
 		And I give in "test" as password
 		When I press Submit on the Persoon Toevoegen page
 		Then I should see the information of the created user on the screen
