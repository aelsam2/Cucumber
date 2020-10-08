Feature: google Search

Scenario: Google search is working
Given user is on google search page
When user enters keyword
And click search icon
Then user is redirected to search result page