
@tag
Feature: Ebay home page scenarios
  @t1
  Scenario: Advanced Search link
  	#Given I open Chrome
    Given I am on Ebay home page
    When I click on advanced link
    Then I navigate to Advanced search page
    #And I close browser


