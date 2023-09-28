
@tag
Feature: Ebay home page scenarios
  @t1
  Scenario: Advanced Search link
  	##Given I open Chrome
    Given I am on Ebay home page
   # When I click on advanced link
   # Then I navigate to Advanced search page
    ##And I close browser

	@tagParams
	Scenario: Search using Parameter
		Given I am on Ebay home page
	#	When I click on advanced link
	#	When I search for 'iphone 11'
		
	@tagDataTable @customTagHooks
	Scenario: Search using Parameter with dataTable
		Given I am on Ebay home page
	#	When I click on advanced link
	#	When I search for specifics
	#		| Keyword | min | max |
	#		| iphone 11| 3000	|10000 |
			
	@tagDataTableOutline
	Scenario Outline: Search using Parameter with scenario outline
		Given I am on Ebay home page
	#	When I click on '<link>'
	#	When I search for specifics
	#		| Keyword | min | max |
	#		| iphone 11| 3000	|10000 |
	#	Examples:
	#		| link | url |
	#		| advancedSearch | https://www.ebay.com/sch/ebayadvsearch |
