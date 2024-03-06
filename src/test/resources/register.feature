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
Feature: Registeration to BookStoreApplication

  Scenario: Register to page
    Given user is on DemoQA Login page
    When user click on new user button
    And user enter firstName 
    And enter lastName
    And enter username
    And enter password
    And click on I am not robot checkbox
    And click on register button
    Then vallidate User Register Successfully alert message
