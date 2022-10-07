Feature: Customer can Purchase Products

Scenario: HomePage

Given user To Launch The Application Url
When user Can Select From The DropDown Categories
And user Can Enter The Products
Then compare The DropDown Suggestion Select

Scenario: Search_ResultPage

When counting The Results.
Then count The Number Of More Results.
 



 
